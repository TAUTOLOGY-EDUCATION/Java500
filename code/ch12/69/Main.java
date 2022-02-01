import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            map1.put(i, 2 * i);
        }
        System.out.println(map1);
    }
}
