import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> vowel = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine();
        boolean hasVowel = false;
        for (char v: vowel) {
            if (str1.indexOf(v) != -1) {
                hasVowel = true;
                break;
            }
        }
        if (hasVowel == true) {
            System.out.println("There is vowel");
        }
        else {
            System.out.println("There is no vowel");
        }
    }
}