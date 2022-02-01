import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert string1: ");
        String string1 = sc.next();
        String string2 = string1.replace("a", "A");
        System.out.println(string2);
    }
}