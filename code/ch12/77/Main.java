import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        boolean removed = false;
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("name", "Mario");
        map3.put("age", "30");
        map3.put("job", "mushroom picker");
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        for (HashMap.Entry<String,String> entry : map3.entrySet()) {
            if (entry.getValue().equals(str1)) {
                map3.remove(entry.getKey());
                removed = true;
            }
        }
        if (!removed) {
            map3.put("new_key", str1);
        }
        System.out.println(map3);
    }
}
