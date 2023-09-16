import java.io.*;
import java.nio.file.*;
import java.util.*;
class WordForARiddle {
    private static String Line(String route) {
        List<String> listOfWord;
        try {
            listOfWord = Files.readAllLines(Paths.get(route));
        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }
        Random random = new Random();
        return listOfWord.get(random.nextInt(listOfWord.toArray().length));
    }

    public static String WordForARiddle() {

        String dictionary = new File("src/resources/russian_nouns.txt").getAbsolutePath();
        String word;
        while (true) {
            word = Line(dictionary);
            if (word.length() > 3)
            {
                break;
            }
        }


        return word;
    }
}