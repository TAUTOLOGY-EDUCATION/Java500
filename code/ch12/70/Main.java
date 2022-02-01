import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        System.out.print("Please insert n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Please insert str: ");
            String str = sc.next();
            array1.add(str);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Please insert numeric: ");
            int numeric = sc.nextInt();
            array2.add(numeric);
        }
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            map1.put(array1.get(i), array2.get(i));
        }
        System.out.println(map1);
    }
}
