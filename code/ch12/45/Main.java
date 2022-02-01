import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array4 = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'));
        for (int i = 0; i < 3; i++) {
            System.out.print("Please insert index: ");
            int index = sc.nextInt();
            System.out.print("Please insert element: ");
            char element = sc.next().charAt(0);
            array4.add(index, element);
        }
        System.out.println(array4);
    }
}
