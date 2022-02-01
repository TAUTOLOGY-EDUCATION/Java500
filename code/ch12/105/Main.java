public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7 - i; j++) {
                if (j < i) {
                    System.out.print("-");
                }
                else {
                    System.out.print("x");
                } 
            }
            System.out.println();
        }
    }
}
