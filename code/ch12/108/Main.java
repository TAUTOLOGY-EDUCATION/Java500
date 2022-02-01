public class Main {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                if (j == i) {
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
