import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vowel = new ArrayList<String>(Arrays.asList("a", "e", "i", "o", "u"));
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        for (String v: vowel) {
            str1 = str1.replace(v, "*");
        }
        System.out.println(str1);
    }
}