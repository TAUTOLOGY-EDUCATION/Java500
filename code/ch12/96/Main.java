import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("Brazil", 35000);
        map1.put("China", 24000);
        map1.put("Germany", 42000);
        map1.put("Japan", 53000);
        map1.put("Sweden", 17000);
        ArrayList<Integer> array1 = new ArrayList<Integer>(map1.values());
        Collections.sort(array1);  
        int n = array1.size();
        double median;
        if (n % 2 == 1) {
            int pos = (n - 1) / 2;
            median = array1.get(pos);
        }
        else {
            int pos = n / 2;
            median = (array1.get(pos - 1) + array1.get(pos)) / 2.0;
        }
        System.out.println(median);
    }
}
