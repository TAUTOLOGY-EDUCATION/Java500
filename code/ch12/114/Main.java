public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                int number = 2 * i + 1;
                for (int j = 0; j < 5 + i; j++) {
                    if (i + j >= 4) {
                        System.out.print(number);
                        number--;
                    }
                    else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            else {
                int number = 1;
                for (int j = 0; j < 5 + i; j++) {
                    if (i + j >= 4) {
                        System.out.print(number);
                        number++;
                    }
                    else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
        }
    }
}
