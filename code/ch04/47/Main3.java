import java.util.ArrayList;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
        System.out.println(array1.subList(array1.size() - 5, 5));
    }
}