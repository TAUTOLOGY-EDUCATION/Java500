import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> country = new ArrayList<String>(Arrays.asList("Brazil", "China", "Germany", "Japan", "Sweden"));
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        int n = country.size();
        int _min = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Please insert " + country.get(i) + " income: ");
            int income = sc.nextInt();
            map1.put(country.get(i), income);
            if (i == 0) {
                _min = income;
            }
            else {
                if (income < _min) {
                    _min = income;
                }
            }
        }
        System.out.println("min income: " + _min);
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == _min) {
                System.out.println("lowest income country: " + entry.getKey());
            }
        }
    }
}
