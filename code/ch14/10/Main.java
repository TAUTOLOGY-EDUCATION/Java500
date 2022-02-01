import java.util.ArrayList;
import java.util.Arrays;

class Cashier {
    ArrayList<String> products;

    public Cashier(ArrayList<String> products) {
        this.products = products;
    }

    public void recommend() {
        System.out.print("We have ");
        for (int i = 0; i < this.products.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(products.get(i));
        }
        System.out.print(".");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>(Arrays.asList("apple", "banana", "orange"));
        Cashier cashier = new Cashier(A);
        cashier.recommend();
    }
}