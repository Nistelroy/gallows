public class Gallows {
    public static void main(String[] args) {


        System.out.println("Для начала игры введи:  1   Для выхода:  2  ");
        while (true) {

            byte word[] = new byte[256];
            int counterChar = 0;
            try {
                counterChar = System.in.read(word);
            } catch (Exception ex) {
                break;
            }
            String strWord = new String(word, 0, counterChar).trim();
            if ("2".equalsIgnoreCase(strWord)) {
                break;
            } else if ("1".equalsIgnoreCase(strWord)){
                Game go = new Game();
                go.gameStart();
                System.out.println("Победа! Для начала новой игры введи:  1   Для выхода:  2  ");
            } else {
                System.out.println("Ты набрал '" + strWord + "' а надо набрать для начала игры:  1   Для выхода:  2  ");
            }
        }
    }
}
