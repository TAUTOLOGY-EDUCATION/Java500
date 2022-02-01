class Car {
    String brand, model, year, color;

    public Car(String brand, String model, String year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void newColor(String color) {
        this.color = color;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car_A = new Car("Honda", "Civic", "2019", "Black");
        car_A.newColor("Red");
        System.out.println("color = " + car_A.color);
    }
}