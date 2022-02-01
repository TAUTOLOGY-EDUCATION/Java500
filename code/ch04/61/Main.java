import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> array7 = new ArrayList<Character>(Arrays.asList('c', 'o', 'd', 'e'));
        Collections.sort(array7);
        System.out.println(array7);
    }
}