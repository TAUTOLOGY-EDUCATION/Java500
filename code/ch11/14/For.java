import java.util.Scanner;
import java.lang.Math;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number : ");
        int n = sc.nextInt();
        double sumx = 0;
        for (int i = 1; i <= n; i++) {
            sumx = sumx + 1.0 / Math.pow(i, 2);
        }
        System.out.println(sumx);
    }
}