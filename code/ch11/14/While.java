import java.util.Scanner;
import java.lang.Math;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number : ");
        int n = sc.nextInt();
        double sumx = 0;
        int i = 1;
        while (i <= n) {
            sumx = sumx + 1.0 / Math.pow(i, 2);
            i = i + 1;
        }
        System.out.println(sumx);
    }
}