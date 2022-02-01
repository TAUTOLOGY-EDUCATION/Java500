import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array3 = new ArrayList<String>(Arrays.asList("apple", "cherry", "eggfruit"));
        array3.add(1, "banana");
        System.out.println(array3);
    }
}