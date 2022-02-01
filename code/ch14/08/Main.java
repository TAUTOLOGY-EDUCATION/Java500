import java.util.ArrayList;
import java.util.Arrays;

class Stats {
    ArrayList<Integer> data;

    public Stats(ArrayList<Integer> data) {
        this.data = data;
    }

    public double mean() {
        double sum = 0;
        for(double i : this.data) {
            sum = sum + i;
        }
        return sum / this.data.size();   
    }

    public double min() {
        double min = this.data.get(0);
        for(double i : this.data) {
            if(i < min) {
                min = i;
            }
        }
        return min;
    }

    public double max() {
        double max = this.data.get(0);
        for(double i : this.data) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }

    public void summary() {
        System.out.println("Mean : " + this.mean());
        System.out.println("Min : " + this.min());
        System.out.println("Max : " + this.max());
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));
        Stats stat_A = new Stats(A);
        stat_A.summary();
    }
}