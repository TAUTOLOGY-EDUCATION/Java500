import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array1 = new ArrayList<String>();
        while (array1.size() != 5) {
            System.out.print("Please insert element: ");
            String element = sc.nextLine();
            if (array1.contains(element) == false) {
                array1.add(element);
            }
        }
        System.out.println(array1);
    }
}
