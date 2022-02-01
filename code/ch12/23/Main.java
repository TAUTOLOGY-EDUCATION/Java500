import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        System.out.print("Please insert char1: ");
        String char1 = sc.nextLine();
        if (char1.length() == 1) {
            int n = str1.length();
            for (int i = 0; i < n; i++) {
                if (str1.charAt(i) == char1.charAt(0)) {
                    System.out.println(i);
                }
            }
        }
    }
}