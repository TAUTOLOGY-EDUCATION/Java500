import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array4 = new ArrayList<Integer>(Arrays.asList(0, 4, 2, 3, 1));
        Collections.sort(array4);
        System.out.println(array4);
    }
}