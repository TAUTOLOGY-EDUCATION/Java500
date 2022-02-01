import java.lang.Math;

class Tree {
    double height, width, generatedMoney;

    public Tree(double height, double width, double generatedMoney) {
        this.height = height;
        this.width = width;
        this.generatedMoney = generatedMoney;
    }

    public void feedA() {
        this.generatedMoney = this.generatedMoney - 10;
        this.width = this.width + 12;
    }

    public void feedB() {
        this.generatedMoney = this.generatedMoney - 8;
        this.height = this.height + 10;
    }

    public void sell() {
        this.generatedMoney = this.generatedMoney + this.width * Math.pow(this.height, 0.8);
        System.out.printf("Width = %.0f, Height = %.0f\n", this.width, this.height);
        System.out.printf("Generated money = %f\n",this.generatedMoney);
    }
}

public class Main {
    public static void main(String[] args) {
        Tree treeA = new Tree(10, 10, 1000);
        treeA.feedA();
        treeA.feedB();
        treeA.sell();
    }
}