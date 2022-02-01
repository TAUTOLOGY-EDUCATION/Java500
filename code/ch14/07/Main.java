class Dog {
    String breed, color;
    double height, weight;

    public Dog(String breed, String color, double height, double weight) {
        this.breed = breed;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public void growth() {
        this.height = this.height * 1.1;
        this.weight = this.weight * 1.1;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog_A = new Dog("Jack Russell Terrier", "White", 30, 7);
        dog_A.growth();
        System.out.println("height = " + dog_A.height);
        System.out.println("weight = " + dog_A.weight);
    }
}