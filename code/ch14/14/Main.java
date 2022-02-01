class Driver {
    int HP, generatedMoney;

    public Driver(int HP, int generatedMoney) {
        this.HP = HP;
        this.generatedMoney = generatedMoney;
    }

    public void drive() {
        this.HP = this.HP - 10;
        this.generatedMoney = this.generatedMoney + 10;
    }

    public void care() {
        this.HP = this.HP + 10;
        this.generatedMoney = this.generatedMoney - 10;
    }

    public void report() {
        System.out.printf("HP = %d, Generated Money = %d\n", this.HP, this.generatedMoney);
    }

}

public class Main {
    public static void main(String[] args) {
        Driver driverA = new Driver(100, 100);
        driverA.drive();
        driverA.report();
        driverA.care();
        driverA.report();
    }
}