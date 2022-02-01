public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 != 0) {
                    System.out.println(i);
                }
            }
            else {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}