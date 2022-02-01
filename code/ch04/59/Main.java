import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array5 = new ArrayList<Integer>(Arrays.asList(-3, 5, 10, -7, 0));
        Collections.sort(array5, Collections.reverseOrder());
        System.out.println(array5);
    }
}