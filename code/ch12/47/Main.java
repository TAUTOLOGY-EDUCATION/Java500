import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array4 = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));
        System.out.print("Please insert num1: ");
        int num1 = sc.nextInt();
        if (num1 <= array4.size() - 1) {
            array4.remove(num1);
        }
        System.out.println(array4);
    }
}
