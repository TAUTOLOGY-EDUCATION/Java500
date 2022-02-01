import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        while (array1.size() != 7) {
            System.out.print("Please insert number: ");
            int number = sc.nextInt();
            if (array1.contains(number)) {
                array1.remove(Integer.valueOf(number));
            }
        }
        System.out.println(array1);
    }
}
