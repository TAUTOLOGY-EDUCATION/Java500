import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int sumPrime = 0;
        int countPrime = 0;
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int i = 1; i <= 25; i++) {
            array2.add(i);
        }
        for (int i = 1; i < array2.size(); i++) {
            int count = 0;
            for (int j = 1; j <= array2.get(i); j++) {
                if (array2.get(i) % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sumPrime += array2.get(i);
                countPrime++;
            }
        }
        double mean = (double)sumPrime / countPrime;
        System.out.println(mean);
    }
}