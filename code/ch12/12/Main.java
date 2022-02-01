import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumPos = 0;
        double sumNeg = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert num" + (i + 1) + ": ");
            double num = sc.nextDouble();
            if (num > 0)
                sumPos += num;
            else if (num < 0)
                sumNeg += num;
        }
        System.out.println("sum positive = " + sumPos);
        System.out.println("sum negative = " + sumNeg);
    }
}