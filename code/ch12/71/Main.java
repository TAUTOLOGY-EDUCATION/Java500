import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();
        System.out.print("Please insert n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Please insert str1: ");
            String str = sc.next();
            array1.add(str);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Please insert str2: ");
            String str = sc.next();
            array2.add(str);
        }
        HashMap<String, String> map1 = new HashMap<String, String>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                map1.put(array1.get(i), array2.get(i));
            else
                map1.put(array2.get(i), array1.get(i));
        }
        System.out.println(map1);
    }
}
