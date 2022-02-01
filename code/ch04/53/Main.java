import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array2 = new ArrayList<String>();
        System.out.print("Please insert first element: ");
        String str1 = sc.next();
        System.out.print("Please insert second element: ");
        String str2 = sc.next();
        System.out.print("Please insert third element: ");
        String str3 = sc.next();
        array2.add(str1);
        array2.add(str2);
        array2.add(str3);
        System.out.println(array2);
    }
}