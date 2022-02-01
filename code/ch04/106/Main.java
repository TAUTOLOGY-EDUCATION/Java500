import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6));
        set1.addAll(set2);
        System.out.println(set1);
    }
}