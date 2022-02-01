import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Please insert element to set1: ");
            String str1 = sc.nextLine();
            set1.add(str1);
        }
        for (int j = 0; j < 3; j++) {
            System.out.print("Please insert element to set2: ");
            String str1 = sc.nextLine();
            set2.add(str1);
        }
        Set<String> set1subtract2 = new HashSet<String>(set1);
        Set<String> set2subtract1 = new HashSet<String>(set2);
        set1subtract2.removeAll(set2);
        System.out.println(set1subtract2);
        set2subtract1.removeAll(set1);
        System.out.println(set2subtract1);
    }
}
