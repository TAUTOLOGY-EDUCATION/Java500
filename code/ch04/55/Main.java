import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array3 = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "eggfruit"));
        array3.add(array3.size() - 1, "kiwi");
        System.out.println(array3);
    }
}