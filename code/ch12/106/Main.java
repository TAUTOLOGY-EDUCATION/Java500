public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j || i + j == 6) {
                    System.out.print("x");
                }
                else {
                    System.out.print("-");
                } 
            }
            System.out.println();
        }
    }
}
