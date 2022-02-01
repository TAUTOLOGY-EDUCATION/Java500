import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        int n = str1.length();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(str1.charAt(i));
            }
        }
    }
}