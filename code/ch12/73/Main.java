import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("apple", "52 kcal");
        map2.put("banana", "132 kcal");
        map2.put("carrot", "46 kcal");
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        if (map2.containsKey(str1)) {
            System.out.println(map2.get(str1));
        }
        else {
            map2.put(str1, "wait for assignment");
            System.out.println(map2);
        }
    }
}
