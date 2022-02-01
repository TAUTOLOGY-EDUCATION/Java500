import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        while (map1.size() != 3) {
            System.out.print("Please insert key: ");
            String key1 = sc.next();
            if (map1.containsKey(key1)) {
                map1.remove(key1);
            }
            else {
                System.out.print("Please insert value: ");
                int value1 = sc.nextInt();
                map1.put(key1, value1);
            }
        }
        System.out.println(map1);
    }
}
