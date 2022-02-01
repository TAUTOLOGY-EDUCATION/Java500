public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            int number = 1;
            for (int j = 1; j < 10; j++) {
                if (i + j >= 10) {
                    System.out.print(number);
                    number += 1;
                }
                else {
                    System.out.print("-");
                } 
            }
            System.out.println();
        }
    }
}
