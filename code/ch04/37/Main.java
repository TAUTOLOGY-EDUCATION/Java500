import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert string1: ");
        String string1 = sc.nextLine();
        System.out.println(Arrays.toString(string1.split(" ")));
    }
}