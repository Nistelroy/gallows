import java.io.*;
import java.nio.file.*;
import java.util.*;
class WordForARiddle {
    private static String Line(String route) {
        List<String> l;
        try {
            l = Files.readAllLines(Paths.get(route));
        } catch (IOException e) {
            e.printStackTrace();

            return null;
        }
        Random random = new Random();
        return l.get(random.nextInt(l.toArray().length));
    }

    public static String WordForARiddle() {

        String route = new File("src/resources/russian_nouns.txt").getAbsolutePath();
        String li;
        while (true) {
            li = Line(route);
            if (li.length() > 3)
            {
                break;
            }
        }


        return li;
    }
}