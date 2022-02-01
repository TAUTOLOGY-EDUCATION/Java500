import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("first_name", "John");
        map1.put("last_name", "Doe");
        map1.put("age", "32");

        map1.remove("age");

        System.out.println(map1);
    }
}