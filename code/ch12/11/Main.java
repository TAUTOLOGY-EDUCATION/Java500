import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumx = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert num" + (i + 1) + ": ");
            int num = sc.nextInt();
            sumx += num;
        }
        System.out.println(sumx);
    }
}