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
        char[] spellTheWorld = new char[nextSecretWorld.length()];   // создаю массив с буквами
        for (int i = 0; i < nextSecretWorld.length(); i++) {
            spellTheWorld[i] = nextSecretWorld.charAt(i);
        }
        System.out.println(Arrays.toString(spellTheWorld) + " chars ");
        String[] worldMask = new String[nextSecretWorld.length()];
        for (int i = 0; i < nextSecretWorld.length(); i++) {
            worldMask[i] = "* ";
        }
        System.out.println(Arrays.toString(worldMask));  // рисую маску слова
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String playerInput = scanner.next();
            String regex = "[а-яёА-ЯЁ]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(playerInput);
            if (playerInput.length() == 1) {         // проверяю длинну ввода
                if (m.find()) {                     // проверяю на кириллицу

                    System.out.println("Символ " + playerInput + " подходит");
                } else
                    System.out.println("Символ " + playerInput + " не подходит");
            }else {
                System.out.println("Надо ввести одну букву " + playerInput + " не подходит");
            }
        }
    }
}






           /*

            byte letter[] = new byte[256];
            int counterChar = 0;
            try {
                counterChar = System.in.read(letter);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                break;
            }
            System.out.println(counterChar + " counterChar");

            String strWord = new String(letter, 0, counterChar).trim();
            System.out.println(strWord + " strWord");


            if ("выход".equalsIgnoreCase(strWord)) {
                break;


            }  else {
                if (strWord.equals(spellTheWorld[0])) {
                    worldMask[0] = spellTheWorld[0];
                } else if (strWord.equals(spellTheWorld[1])) {
                    worldMask[1] = spellTheWorld[1];
                } else if (strWord.equals(spellTheWorld[2])) {
                    worldMask[2] = spellTheWorld[2];
                } else if (strWord.equals(spellTheWorld[3])) {
                    worldMask[3] = spellTheWorld[3];
                } else if (strWord.equals(spellTheWorld[4])) {
                    worldMask[4] = spellTheWorld[4];
                } else if (strWord.equals(spellTheWorld[5])) {
                    worldMask[5] = spellTheWorld[5];
                }  else  {

                    errorNumber = errorNumber + 1;
                    System.out.println("Ошибка " + errorNumber);
                    stand.stand(errorNumber);
                }

                System.out.print("\033[H\033[J");
                stand.stand(errorNumber);
                for (int j = 0; j < 6; j++) {
                    if (j == 5) {
                        System.out.println(" " + worldMask[j]);
                    } else {
                        System.out.print(" " + worldMask[j]);
                    }*/


