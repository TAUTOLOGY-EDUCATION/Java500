import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        int n = str1.length();
        String str2 = "";
        for (int i = n - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }
        System.out.println(str2);
    }
}