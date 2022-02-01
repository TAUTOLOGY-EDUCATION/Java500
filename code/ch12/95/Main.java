import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(6, 5, 7, 9, 8, 1, 3, 5, 7, 2));
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
