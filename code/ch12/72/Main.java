import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> array1 = new ArrayList<Double>();
        System.out.print("Please insert n: ");
        int n = sc.nextInt();
        double sumx = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Please insert numeric: ");
            double numeric = sc.nextDouble();
            array1.add(numeric);
            sumx += numeric;
        }
        double mean = sumx / n;
        double var = 0;
        for (int i = 0; i < n; i++) {
            var = var + (array1.get(i) - mean) * (array1.get(i) - mean);
        }
        var /= n;
        HashMap<String, Double> map1 = new HashMap<String, Double>();
        map1.put("mean", mean);
        map1.put("variance", var);
        System.out.println(map1);
    }
}
