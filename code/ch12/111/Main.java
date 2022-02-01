public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (9 - i <= j && j <= 9 + i) {
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
