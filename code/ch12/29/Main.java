import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        System.out.print("Please insert int1: ");
        int int1 = sc.nextInt();
        while (str1.length() < int1) {
            str1 += '*';
        }
        System.out.println(str1);
    }
}