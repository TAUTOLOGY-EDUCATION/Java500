import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array4 = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));
        System.out.print("Please insert char1: ");
        char char1 = sc.next().charAt(0);
        if (array4.contains(char1)) {
            array4.remove(Character.valueOf(char1));
        }
        System.out.println(array4);
    }
}
