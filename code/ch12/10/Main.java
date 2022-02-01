public class Main {
    public static void main(String[] args) {
        int sumx = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                sumx += i;
            }
        }
        System.out.println(sumx);
    }
}