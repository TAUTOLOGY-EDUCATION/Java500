import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.print("Please insert int1: ");
        int int1 = sc.nextInt();
        System.out.println(set1.contains(int1));
    }
}