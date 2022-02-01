import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        ArrayList<String> array2 = new ArrayList<String>(Arrays.asList("ant", "bird", "cat", "dog"));
        int n = array1.size();
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        for (int i = 0; i < n; i++) {
            map1.put(array1.get(i), array2.get(i));
        }
        System.out.println(map1);
    }
}
