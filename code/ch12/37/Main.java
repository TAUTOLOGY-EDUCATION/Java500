import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int n = array1.size();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(array1.get(i));
            }
        }
    }
}
