class ComplexNumber {
    int r, i;

    public ComplexNumber(int r, int i) {
        this.r = r;
        this.i = i;
    }

    public void getValue() {
        System.out.println(this.r + "+" + this.i + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber Z = new ComplexNumber(2, 4);
        Z.getValue();
    }
}