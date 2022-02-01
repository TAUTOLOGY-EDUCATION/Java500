import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number : ");
        int n = sc.nextInt();
        int sumx = 0;
        for (int i = 1; i <= n; i++) {
            sumx = sumx + i;
        }
        System.out.println(sumx);
    }
}