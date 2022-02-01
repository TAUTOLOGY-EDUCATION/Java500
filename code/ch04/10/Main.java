import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please insert double1: ");
        double double1 = sc.nextDouble();
        System.out.print("Please insert double2: ");
        double double2 = sc.nextDouble();

        System.out.println("double1: " + double1);
        System.out.println("double2: " + double2);
    
        double a = double1 + double2;
        System.out.println("sum: " + a);
    
        double b = double1 - double2;
        System.out.println("difference: " + b);
    
        double c = double1 * double2;
        System.out.println("product: " + c);
    
        double d = double1 / double2;
        System.out.println("quotient: " + d);
    }
}