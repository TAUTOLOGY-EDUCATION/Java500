import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<String>(Arrays.asList("one", "two", "three", "four"));
        ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        int n = array1.size();
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            map1.put(array1.get(i), array2.get(i));
        }
        System.out.println(map1);
    }
}
