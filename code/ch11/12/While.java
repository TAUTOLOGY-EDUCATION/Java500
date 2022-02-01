import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number : ");
        int n = sc.nextInt();
        int product = 1;
        int i = 1;
        while (i <= n) {
            product = product * i;
            i = i + 1;
        }
        System.out.println(product);
    }
}