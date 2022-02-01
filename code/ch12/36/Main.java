import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int n = array1.size();
        ArrayList<Integer> backwardArray = new ArrayList<Integer>();
        for (int i = n - 1; i >= 0; i--) {
            backwardArray.add(array1.get(i));
        }
        System.out.println(array1);
    }
}
