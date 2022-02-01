import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6));
        HashSet<Integer> set1MinusSet2 = new HashSet<Integer>(set1);
        HashSet<Integer> set2MinusSet1 = new HashSet<Integer>(set2);
        set1MinusSet2.removeAll(set2);
        set2MinusSet1.removeAll(set1);
        HashSet<Integer> symmetricDifference = new HashSet<Integer>(set1MinusSet2);
        symmetricDifference.addAll(set2MinusSet1);
        System.out.println(symmetricDifference);
    }
}