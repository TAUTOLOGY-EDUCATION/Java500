public class Main {
    static void drawTree3() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 + i; j++) {
                if (j >= 3 - i) {
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
        drawTree3();
    }
}

/*
เหมือนบท 12 ข้อ 110
*/