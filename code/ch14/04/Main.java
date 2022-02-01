import java.lang.Math;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle_A = new Circle(32);
        Circle circle_B = new Circle(16);
        System.out.println("Area Circle A : " + circle_A.getArea());
        System.out.println("Perimeter Circle A : " + circle_A.getPerimeter());
        System.out.println("Area Circle B : " + circle_B.getArea());
        System.out.println("Perimeter Circle B : " + circle_B.getPerimeter());
    }
}