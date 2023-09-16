public class Viselica {
    public static void main(String[] args) {
       

        System.out.println("Скажи старт или выход");
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
            } else if ("старт".equalsIgnoreCase(strWord)){
                Game go = new Game();
                go.gameStart();
            } else {
                System.out.println("Ты набрал '" + strWord + "' а надо набрать старт или выход");
            }
        }
    }
}
            /*
            if ("выход".equalsIgnoreCase(strWord)) {
                break;
            } else if("старт".equalsIgnoreCase(strWord)){
                while (true){

                    byte word1[] = new byte[256];
                    int counterChar1 = 0;
                    try {
                        counterChar1 = System.in.read(word1);
                    } catch (Exception ex) {
                        System.out.println(ex.toString());
                        break;
                    }
                    String strWord1 = new String(word1, 0, counterChar).trim();

                }}}}}

                else {
                    String[] bukvy;
                    Stoyka a = new Stoyka();
                    int miss = 0;
                    Slovo b = new Slovo();
                    String worldShadow = b.randomWorld();
                    String str = worldShadow;
                    char[] chars = new char[str.length()];
                    for (int i = 1; i < (str.length() - 1); i++) {
                        chars[i] = str.charAt(i);
                    }
                    bukvy = new String[6];
                    for (int i = 1; i <= 6; i++) {
                        bukvy[i - 1] = String.valueOf(chars[i]);
                    }
                    String[] quests = {"_ ", "_ ", "_ ", "_ ", "_ ", "_ "};
                    a.stoyka(miss);}
                for (int i = 0; i < 6; i++) {

                    if (strWord.equals(bukvy[i])) {
                        quests[i] = bukvy[i];
                        break;
                    } else if (i == 5) {
                        miss = miss + 1;
                        System.out.println("Ошибка " + miss);
                        break;

                    }
                    for (int j = 0; j < 6; j++) {
                        System.out.print(quests[j]);
                    }

                }
            }
        }
    }
}
*/