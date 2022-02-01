import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList< ArrayList<Integer> > matrix1 = new ArrayList< ArrayList<Integer> >();
        matrix1.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        matrix1.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        matrix1.add(new ArrayList<Integer>(Arrays.asList(7, 8, 9)));
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<ArrayList<Integer>>();
        matrix2.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        matrix2.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        matrix2.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        int nRows = matrix1.size();
        int nColumns = matrix1.get(0).size();
        ArrayList<ArrayList<Integer>> sumMatrix = new ArrayList<ArrayList<Integer>>();
        sumMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0)));
        sumMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0)));
        sumMatrix.add(new ArrayList<Integer>(Arrays.asList(0, 0, 0)));
        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nColumns; c++) {
                sumMatrix.get(r).set(c, matrix1.get(r).get(c) + matrix2.get(r).get(c));
            }
        }
        System.out.println(sumMatrix);
    }
}
