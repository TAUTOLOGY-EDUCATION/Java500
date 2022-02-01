class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void aging(int years) {
        System.out.println("Before : " + this.age + " years old");
        this.age = this.age + years;
        System.out.println("After : " + this.age + " years old");
    }
}

public class Main {
    public static void main(String[] args) {
        Human John = new Human("John", 23);
        John.aging(10);
    }
}