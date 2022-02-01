import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("first_name", "John");
        map1.put("last_name", "Doe");

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("age", "32");
        map2.put("hobby", "coding");

        map1.putAll(map2);

        System.out.println(map1);
    }
}