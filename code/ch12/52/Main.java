import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(-10, 7, -33, 15, 29));
        int n = array1.size();
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                array1.remove(i);
            }
        }
        System.out.println(array1);
    }
}
