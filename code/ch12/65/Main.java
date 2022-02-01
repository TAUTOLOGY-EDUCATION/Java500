import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.print("Please insert number: ");
        int number = sc.nextInt();
        if (array1.contains(number)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
