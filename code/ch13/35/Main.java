public class Main {
    static void drawTree(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print('x');
                }
                else {
                    System.out.print('-');
                }
            }
            System.out.println();
        } 
     }
    public static void main(String[] args) {
        drawTree(5);
    }
}

/*
เหมือนบท 12 ข้อ 106
*/