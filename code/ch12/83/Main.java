import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set1 = new HashSet<String>(Arrays.asList("1", "2", "3", "a", "b", "c"));
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        if (set1.contains(str1)) {
            set1.remove(str1);
        }
        System.out.println(set1);
    }
}
