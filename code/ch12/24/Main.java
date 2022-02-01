import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countA = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Please insert word: ");
            String word = sc.nextLine();
            int nAppear = (int)word.chars().filter(ch -> ch == 'a').count();
            countA += nAppear;
        }
        System.out.println(countA);
    }
}