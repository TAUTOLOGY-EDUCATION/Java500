public class Main {
    public static void main(String[] args) {
        int sumx = 0;
        int countPrime = 0;
        int i = 1;
        while (countPrime <= 99) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sumx += i;
                countPrime++;
            }
            i++;
        }
        System.out.println(sumx);
    }
}