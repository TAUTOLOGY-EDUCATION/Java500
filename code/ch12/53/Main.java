import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        for (int i = 1; i < 26; i++) {
            array3.add(i);
        }
        int n = array3.size();
        for (int i = n - 1; i >= 0; i--) {
            if (array3.get(i) % 2 == 0) {
                if (array3.get(i) % 3 != 0) {
                    array3.remove(i);
                }
            }
            else {
                if (array3.get(i) % 3 == 0) {
                    array3.remove(i);
                }
            }
        }
        System.out.println(array3);
    }
}
