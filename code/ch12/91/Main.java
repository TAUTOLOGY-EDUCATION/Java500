import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double _min = 0.0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert number " + (i + 1) + ": ");
            double number = sc.nextDouble();
            if (i == 0) {
                _min = number;
            }
            else {
                if (number < _min) {
                    _min = number;
                }
            }
        }
        System.out.println(_min);
    }
}
