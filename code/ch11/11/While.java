import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number : ");
        int n = sc.nextInt();
        int sumx = 0;
        int i = 1;
        while (i <= n) {
            sumx = sumx + i;
            i = i + 1;
        }
        System.out.println(sumx);
    }
}