public class Stoyka {
    public void stoyka(int miss) {
        if (miss == 0) {

            System.out.println("    ________");
            System.out.println("    |      |");
            System.out.println("           |");
            System.out.println("           |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + miss);
        } else if (miss == 1) {

            System.out.println("    ________");
            System.out.println("    |      |");
            System.out.println("    0      |");
            System.out.println("           |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + miss);
        } else if (miss == 2) {

            System.out.println("    ________");
            System.out.println("    |      |");
            System.out.println("    0      |");
            System.out.println("    0      |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + miss);
        } else if (miss == 3) {

            System.out.println("    ________");
            System.out.println("    |      |");
            System.out.println("    0      |");
            System.out.println("    0--    |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + miss);
        } else if (miss == 4) {

            System.out.println("    ________");
            System.out.println("    |      |");
            System.out.println("    0      |");
            System.out.println("  --0--    |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + miss);
        } else if (miss == 5) {

            System.out.println("    ________");
            System.out.println("    |      |");
            System.out.println("    0      |");
            System.out.println("  --0--    |");
            System.out.println("   /       |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + miss);
        } else if (miss == 6) {

            System.out.println("    ________");
            System.out.println("    |      |");
            System.out.println("    0      |");
            System.out.println("  --0--    |");
            System.out.println("   / |     |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + miss + " Ты проиграл, напиши выход");

        } else if(miss>6) {
            System.out.println("    ________");
            System.out.println("    |      |");
            System.out.println("    0      |");
            System.out.println("  --0--    |");
            System.out.println("   / |     |");
            System.out.println("___________|");
            System.out.println("Ошибок: слишком много. Ты мёртв, уймись, напиши выход");
        }

        }
        ;

    }






