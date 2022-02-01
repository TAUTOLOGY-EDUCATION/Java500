import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("name", "Mario");
        map3.put("age", "30");
        map3.put("job", "mushroompicker");
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        if (map3.containsValue(str1)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
