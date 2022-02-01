class USDTHB {
    double amount;
    String currency;

    public USDTHB(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double toUSD() {
        if (this.currency == "THB") {
            this.currency = "USD";
            this.amount = this.amount / 30;
            return this.amount / 30;
        }
        else {
            return this.amount;
        }
    }

    public double toTHB() {
        if (this.currency == "USD") {
            this.currency = "THB";
            this.amount = this.amount * 30;
            return this.amount * 30;
        }
        else {
            return this.amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        USDTHB money = new USDTHB(30000, "USD");
        System.out.println(money.amount + " " + money.currency);
        money.toTHB();
        System.out.println(money.amount + " " + money.currency);
        money.toUSD();
        System.out.println(money.amount + " " + money.currency);
    }
}