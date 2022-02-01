import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<Integer>();
        System.out.print("Please insert num1: ");
        int str1 = sc.nextInt();
        System.out.print("Please insert num2: ");
        int num2 = sc.nextInt();
        System.out.print("Please insert num3: ");
        int num3 = sc.nextInt();
        set1.add(str1);
        set1.add(num2);
        set1.add(num3);
        System.out.println(set1);
    }
}