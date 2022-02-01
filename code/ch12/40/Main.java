import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array1 = new ArrayList<Character>(Arrays.asList('a', 'l', 'l', 'i', 'g', 'a', 't', 'o', 'r'));
        System.out.print("Please insert char1: ");
        char char1 = sc.next().charAt(0);
        int n = array1.size();
        for (int i = 0; i < n; i++) {
            if (array1.get(i) == char1) {
                System.out.println(i);
            }
        }
    }
}
