import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main2 {
    static void print(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.print("]");
    }
    static void print2d(int[][] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            print(a[i]);
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int nRows = matrix1.length;
        int nColumns = matrix1.length;
        int[][] sumMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nColumns; c++) {
                sumMatrix[r][c] = matrix1[r][c] + matrix2[r][c];
            }
        }
        print2d(sumMatrix);
    }
}
