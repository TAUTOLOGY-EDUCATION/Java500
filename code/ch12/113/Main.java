public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            int number = 0;
            for (int j = 0; j < 9 + i; j++) {
                if (i + j >= 8 && j <= 8) {
                    number++;
                    System.out.print(number);
                }
                else if (i + j >= 8 && j > 8) {
                    number--;
                    System.out.print(number);
                }
                else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
