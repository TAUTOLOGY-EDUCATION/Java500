import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map3 = new HashMap<String, String>();
        ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("first_name", "last_name", "age", "job"));
        map3.put("name", "Mario");
        map3.put("age", "30");
        map3.put("job", "mushroom picker");
        int n = array1.size();
        for (int i = 0; i < n; i++) {
            if(map3.containsKey(array1.get(i))) {
                map3.remove(array1.get(i));
            }
        }
        System.out.println(map3);
    }
}
