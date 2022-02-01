import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please insert int1: ");
        int int1 = sc.nextInt();
        System.out.print("Please insert int2: ");
        int int2 = sc.nextInt();

        System.out.println("int1: " + int1);
        System.out.println("int2: " + int2);
    
        int a = int1 + int2;
        System.out.println("sum: " + a);
    
        int b = int1 - int2;
        System.out.println("difference: " + b);
    
        int c = int1 * int2;
        System.out.println("product: " + c);
    
        int d = int1 / int2;
        System.out.println("quotient: " + d);
    }
}