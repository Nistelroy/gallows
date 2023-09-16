public class GallowsStand {
    public void stand(int errorNumber) {
        System.out.println("    ________");
        System.out.println("    |      |");
        if (errorNumber == 0) {
            System.out.println("           |");
            System.out.println("           |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + errorNumber);
        } else if (errorNumber == 1) {
            System.out.println("    0      |");
            System.out.println("           |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + errorNumber);
        } else if (errorNumber == 2) {
            System.out.println("    0      |");
            System.out.println("    0      |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + errorNumber);
        } else if (errorNumber == 3) {
            System.out.println("    0      |");
            System.out.println("    0--    |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + errorNumber);
        } else if (errorNumber == 4) {
            System.out.println("    0      |");
            System.out.println("  --0--    |");
            System.out.println("           |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + errorNumber);
        } else if (errorNumber == 5) {
            System.out.println("    0      |");
            System.out.println("  --0--    |");
            System.out.println("   /       |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + errorNumber);
        } else if (errorNumber == 6) {
            System.out.println("    0      |");
            System.out.println("  --0--    |");
            System.out.println("   / |     |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + errorNumber + " Ты проиграл, для выхода напиши:  2   ");
        } else if(errorNumber>6) {
            System.out.println("    0      |");
            System.out.println("  --0--    |");
            System.out.println("   / |     |");
            System.out.println("___________|");
            System.out.println("Ошибок: " + errorNumber + ". Ты мёртв. Продолжать бесполезно. для выхода напиши:  2   ");
        }
    }
}






