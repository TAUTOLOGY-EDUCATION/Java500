import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please insert int1: ");
        int int1 = sc.nextInt();
        System.out.print("Please insert double1: ");
        double double1 = sc.nextDouble();

        System.out.println("int1: " + int1);
        System.out.println("double1: " + double1);
    
        double a = int1 + double1;
        System.out.println("sum: " + a);
    
        double b = int1 - double1;
        System.out.println("difference: " + b);
    
        double c = int1 * double1;
        System.out.println("product: " + c);
    
        double d = int1 / double1;
        System.out.println("quotient: " + d);
    }
}