import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert element: ");
            int element = sc.nextInt();
            if (!array1.contains(element)) {
                array1.add(element);
            }
        }
        System.out.println(array1);
    }
}
