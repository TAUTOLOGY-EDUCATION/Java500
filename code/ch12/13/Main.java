import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double product = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert num" + (i + 1) + ": ");
            double num = sc.nextInt();
            if (num > 0)
                product *= num;
        }
        System.out.println(product);
    }
}