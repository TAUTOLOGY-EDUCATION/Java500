import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<String>();
        System.out.print("Please insert str1: ");
        String str1 = sc.next();
        System.out.print("Please insert str2: ");
        String str2 = sc.next();
        System.out.print("Please insert str3: ");
        String str3 = sc.next();
        set1.addAll(new HashSet<String>(Arrays.asList(str1, str2, str3)));
        System.out.println(set1);
    }
}