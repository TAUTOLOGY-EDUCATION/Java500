class Businessman {
    int HP, money, happiness;

    public Businessman(int HP, int money, int happiness) {
        this.HP = HP;
        this.money = money;
        this.happiness = happiness;
    }

    public void work() {
        this.money = this.money + 20;
        this.happiness = this.happiness + 10;
        this.HP = this.HP - 10;
    }

    public void sleep() {
        this.money = this.money - 10;
        this.HP = this.HP + 20;
        this.happiness = this.happiness + 10;
    }

    public void play() {
        this.happiness = this.happiness + 20;
        this.HP = this.HP - 10;
        this.money = this.money - 10;
    }

    public void report() {
        System.out.printf("HP = %d, Money = %d, Happiness = %d\n", this.HP, this.money, this.happiness);
    }
}

public class Main {
    public static void main(String[] args) {
        Businessman John = new Businessman(100, 100, 100);
        John.report();
        John.work();
        John.report();
        John.play();
        John.report();
        John.sleep();
        John.report();
    }
}