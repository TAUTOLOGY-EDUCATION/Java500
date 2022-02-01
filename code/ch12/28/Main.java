import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String concatString = "";
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert str: ");
            String str = sc.nextLine();
            concatString += str;
        }
        System.out.println(concatString);
    }
}