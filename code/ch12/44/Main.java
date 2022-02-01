import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayX = new ArrayList<Integer>(Arrays.asList(0, 2 ,4 ,6, 8));
        ArrayList<Character> array4 = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));
        int n = arrayX.size();
        for (int i = 0; i < n; i++) {
            array4.add(arrayX.get(i), '*');
        }
        System.out.println(array4);
    }
}
