import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("first_name", "John");
        map1.put("last_name", "Doe");
        map1.put("age", "32");

        System.out.print("Please insert str1: ");
        String str1 = sc.next();

        System.out.println(map1.containsValue(str1));
    }
}