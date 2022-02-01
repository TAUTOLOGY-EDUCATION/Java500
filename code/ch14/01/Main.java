class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.print("My name is " + this.name + ". ");
        System.out.println("I'm  " + this.age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        People John = new People("John", 23);
        John.introduce();
    }
}