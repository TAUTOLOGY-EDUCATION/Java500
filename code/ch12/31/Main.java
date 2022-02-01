import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        Set<Character> set1 = new HashSet<Character>(str1.chars().mapToObj(e -> (char)e).collect(Collectors.toList())); 
        for (char s: set1) {
            int count = (int)str1.chars().filter(ch -> ch == s).count();
            System.out.println(s + " " + count);
        }
    }
}
