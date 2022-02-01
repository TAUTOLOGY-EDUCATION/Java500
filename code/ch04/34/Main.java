import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert string1: ");
        String string1 = sc.next();
        System.out.print("Please insert string2: ");
        String string2 = sc.next();
        System.out.println(string1.contains(string2));
    }
}