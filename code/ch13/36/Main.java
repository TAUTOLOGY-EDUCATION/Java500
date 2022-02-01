public class Main {
    static void drawTree2(int n) {
        int row = n % 2 == 0 ? n - 1 : n;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (j == Math.abs((n - 1) / 2 - i) || j == n - 1 - Math.abs((n - 1) / 2 - i)) {
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
        drawTree2(6);
    }
}

/*
เหมือนบท 12 ข้อ 107
*/