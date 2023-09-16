public class Game {
    public void gameStart() {
        System.out.println("игра началась");

        int miss = 0;
        Stoyka stoyka = new Stoyka();
        stoyka.stoyka(miss);
        Slovo slovo = new Slovo();
        String nextSicretWorld = slovo.randomWorld();
        char[] chars = new char[nextSicretWorld.length()];
        for (int i = 1; i < (nextSicretWorld.length() - 1); i++) {
            chars[i] = nextSicretWorld.charAt(i);
        }
        String[] bukvy;
        bukvy = new String[6];
        for (int i = 1; i <= 6; i++) {
            bukvy[i - 1] = String.valueOf(chars[i]);
        }
        String[] quests = {"_ ", "_ ", "_ ", "_ ", "_ ", "_ "};
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.println(" " + quests[i]);
            } else {
                System.out.print(" " + quests[i]);
            }
        }
        while (true) {

            byte word[] = new byte[256];
            int counterChar = 0;
            try {
                counterChar = System.in.read(word);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                break;
            }
            String strWord = new String(word, 0, counterChar).trim();
            if ("выход".equalsIgnoreCase(strWord)) {
                break;
            } else {
                if (strWord.equals(bukvy[0])) {
                    quests[0] = bukvy[0];
                } else if (strWord.equals(bukvy[1])) {
                    quests[1] = bukvy[1];
                } else if (strWord.equals(bukvy[2])) {
                    quests[2] = bukvy[2];
                } else if (strWord.equals(bukvy[3])) {
                    quests[3] = bukvy[3];
                } else if (strWord.equals(bukvy[4])) {
                    quests[4] = bukvy[4];
                } else if (strWord.equals(bukvy[5])) {
                    quests[5] = bukvy[5];
                }  else {

                    miss = miss + 1;
                    System.out.println("Ошибка " + miss);
                    stoyka.stoyka(miss);
                }

                System.out.print("\033[H\033[J");
                stoyka.stoyka(miss);
                for (int j = 0; j < 6; j++) {
                    if (j == 5) {
                        System.out.println(" " + quests[j]);
                    } else {
                        System.out.print(" " + quests[j]);
                    }
                }

            }
        }
    }
}

