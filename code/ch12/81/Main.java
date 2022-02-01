import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert number: ");
            int number = sc.nextInt();
            set1.add(number);
        }
        System.out.println(set1);
        System.out.println(set1.size());
    }
}
