import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array1 = new ArrayList<Character>(Arrays.asList('t', 'u', 'r', 'i', 'n', 'g'));
        ArrayList<Character> array2 = new ArrayList<Character>(Arrays.asList('n', 'e', 'w', 't', 'o', 'n'));
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        int n = array1.size();
        int m = array2.size();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                set1.add(array1.get(i));
            }
        }
        for (int j = 0; j < m; j++) {
            if (j % 2 == 1) {
                set2.add(array2.get(j));
            }
        }
        set1.addAll(set2);
        System.out.println(set1);
    }
}
