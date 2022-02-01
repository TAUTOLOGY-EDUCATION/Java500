import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array6 = new ArrayList<Character>(Arrays.asList('d', 'a', 'c', 'b', 'e'));
        Collections.sort(array6);
        System.out.println(array6);
    }
}