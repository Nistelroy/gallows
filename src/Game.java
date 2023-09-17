import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    public void gameStart() {
        System.out.println("игра началась");
        int errorNumber = 0;
        GallowsStand stand = new GallowsStand();
        stand.stand(errorNumber);                        // рисую стойку
        WordForARiddle hiddenWord = new WordForARiddle();
        String nextSecretWorld = hiddenWord.WordForARiddle();  // загадываю слово
        String[] spellTheWorld = new String[nextSecretWorld.length()];   // создаю массив с буквами
        for (int i = 0; i < nextSecretWorld.length(); i++) {
            spellTheWorld[i] = String.valueOf(nextSecretWorld.charAt(i));
        }
        //  System.out.println(Arrays.toString(spellTheWorld) + " chars "); строка проверки загаданного слова
        String[] worldMask = new String[nextSecretWorld.length()];
        for (int i = 0; i < nextSecretWorld.length(); i++) {
            worldMask[i] = "* ";
        }
        System.out.println(Arrays.toString(worldMask));  // рисую маску слова
        System.out.println("Попробуй отгадать букву");
        while (errorNumber < 6) {
            Scanner scanner = new Scanner(System.in);
            String playerInput = scanner.next().toLowerCase();

            String regex = "[а-яёА-ЯЁ]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(playerInput);
            if (playerInput.length() == 1) {         // проверяю длинну ввода
                if (m.find()) {                     // проверяю на кириллицу

                    boolean isCorrectGuess = false;
                     for (int i = 0; i < spellTheWorld.length; i++) {
                        if (spellTheWorld[i].equals(playerInput)) {
                            worldMask[i] = playerInput;
                            isCorrectGuess = true;
                        }}
                     if (isCorrectGuess) {
                         System.out.println("Угодал");
                         System.out.println(Arrays.toString(worldMask));
                         if(Arrays.equals(worldMask, spellTheWorld)){
                             break;
                         }
                     } else {
                         errorNumber += 1;
                         stand.stand(errorNumber);
                     }


                } else {
                    System.out.println("Символ " + playerInput + " не подходит");
                    System.out.println("Символ должен содержать одну кириллическую букву");
                }
            } else {
                System.out.println("Надо ввести одну букву " + playerInput + " не подходит");

            }
        }
    }
}


