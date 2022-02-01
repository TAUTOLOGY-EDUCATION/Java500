import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Double, Integer> map1 = new HashMap<Double, Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert number " + (i + 1) + ": ");
            double number = sc.nextDouble();
            if (map1.containsKey(number)) {
                map1.put(number, map1.get(number) + 1);
            }
            else {
                map1.put(number, 1);
            }
        }
        System.out.println(map1);
    }
}
