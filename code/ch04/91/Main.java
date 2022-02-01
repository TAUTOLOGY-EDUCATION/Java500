import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> map1 = new HashMap<String, String>();

        System.out.print("Please insert key: ");
        String str1 = sc.next();
        System.out.print("Please insert value: ");
        String str2 = sc.next();

        map1.put(str1, str2);

        System.out.println(map1);
    }
}