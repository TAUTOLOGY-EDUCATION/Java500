class Warrior {
    int power, defense, HP;

    public Warrior(int power, int defense, int HP) {
        this.power = power;
        this.defense = defense;
        this.HP = HP;
    }

    public void attack(Warrior enemy) {
        if (enemy.HP > 0 && this.HP > 0) {
            enemy.HP = Math.max(0, enemy.HP - Math.max(0, this.power - enemy.defense));
        }
        if (enemy.HP == 0) {
            System.out.println("Enemy died");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Warrior WarriorA = new Warrior(100, 50, 80);
        Warrior WarriorB = new Warrior(60, 80, 120);
        System.out.println("=== Before Attack ===");
        System.out.println("Warrior A HP = " + WarriorA.HP);
        System.out.println("Warrior B HP = " + WarriorB.HP);
        WarriorA.attack(WarriorB);
        WarriorB.attack(WarriorA);
        System.out.println("=== After Attack ===");
        System.out.println("Warrior A HP = " + WarriorA.HP);
        System.out.println("Warrior B HP = " + WarriorB.HP);
    }
}