import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static void print(char[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'd', 'e', 'f'};
        print(array1);
    }
}
