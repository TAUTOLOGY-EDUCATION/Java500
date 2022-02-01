import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f');
        Set<Character> set1 = new HashSet<>(list);
        System.out.println(set1);
    }
}
