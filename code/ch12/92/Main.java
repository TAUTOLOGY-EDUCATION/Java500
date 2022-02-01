import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> array1 = new ArrayList<Double>();
        double _min = 0.0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert number " + (i + 1) + ": ");
            double number = sc.nextDouble();
            array1.add(number);
            if (i == 0) {
                _min = number;
            }
            else {
                if (number < _min) {
                    _min = number;
                }
            }
        }
        int countMin = 0;
        int n = array1.size();
        for (int i = 0; i < n; i++) {
            if (_min == array1.get(i)) {
                countMin += 1;
            }
        }
        System.out.println("min: " + _min);
        System.out.println("countMin: " + countMin);
    }
}
