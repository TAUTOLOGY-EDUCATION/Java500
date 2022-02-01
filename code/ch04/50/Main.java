import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array2 = new ArrayList<String>(Arrays.asList("ant", "bird", "cat", "dog", "eagle"));
        array2.set(3, "duck");
        System.out.println(array2);
    }
}