import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Double> set1 = new HashSet<Double>(); 
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert number " + (i + 1) + ": ");
            double number = sc.nextDouble();
            set1.add(number);
        }
        System.out.println(set1);
    }
}
