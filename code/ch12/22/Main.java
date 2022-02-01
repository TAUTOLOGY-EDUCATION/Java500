import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countLen = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert word: ");
            String word = sc.nextLine();
            int length = word.length();
            countLen += length;
        }
        System.out.println(countLen);
    }
}