import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 2, 3));
        array1.remove(array1.size() - 1);
        array1.remove(2);
        System.out.println(array1);
    }
}