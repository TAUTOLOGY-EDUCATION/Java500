import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(0, 1, 2));
        ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(3, 4, 5));
        array1.addAll(array2);
        System.out.println(array1);
        System.out.println(array2);
    }
}