import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<Integer>(Arrays.asList(-10, 7, -33, 15, 29));
        System.out.print("Please insert number: ");
        int number = sc.nextInt();
        if (array1.contains(number)) {
            array1.remove(Integer.valueOf(number));
        }
        else {
            array1.add(number);
        }
        System.out.println(array1);
    }
}
