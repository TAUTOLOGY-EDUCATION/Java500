class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("Current position : (%d, %d)\n", this.x, this.y);
    }

    public void moveUp(int d) {
        this.y = this.y + d;
        System.out.printf("Current position : (%d, %d)\n", this.x, this.y);
    }

    public void moveDown(int d) {
        this.y = this.y - d;
        System.out.printf("Current position : (%d, %d)\n", this.x, this.y);
    }

    public void moveLeft(int d) {
        this.x = this.x - d;
        System.out.printf("Current position : (%d, %d)\n", this.x, this.y);
    }

    public void moveRight(int d) {
        this.x = this.x + d;
        System.out.printf("Current position : (%d, %d)\n", this.x, this.y);
    }
}

public class Main {
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        A.moveUp(20);
        A.moveLeft(23);
        A.moveDown(65);
        A.moveRight(50);
    }
}