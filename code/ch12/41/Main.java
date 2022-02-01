import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array3 = new ArrayList<String>();
        for (int x = 1; x < 26; x++) {
            array3.add(String.valueOf(x));
        }
        int n = array3.size();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array3.set(i, "a");
            }
        }
        System.out.println(array3);
    }
}
