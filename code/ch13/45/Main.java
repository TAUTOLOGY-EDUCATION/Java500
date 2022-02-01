import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    @SuppressWarnings("unchecked")
    static ArrayList<ArrayList<Integer>> reshape(ArrayList<Integer> arrayA, int row, int col) {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<ArrayList<Integer>>();
        int i = 0;
        for (int r = 0; r < row; r++) {
            matrixA.add(new ArrayList());
            for (int c = 0; c < col; c++) {
                matrixA.get(r).add(arrayA.get(i));
                i++;
            }
        }
        return matrixA;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        System.out.println(reshape(A, 4, 3));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays
บรรทัดที่ 03 : import library ชื่อ Collections

บรรทัดที่ 05 : ประกาศ class ชื่อ Main
บรรทัดที่ 06 : ignore warning

บรรทัดที่ 07 : ประกาศฟังก์ชันชื่อ reshape ที่รับ parameter เป็น arrayA, row และ col
บรรทัดที่ 08 : สร้างตัวแปรชื่อ matrixA และกำหนดให้ มีขนาดเท่ากับ row x col มีค่าเริ่มต้นเป็น 0 ในทุกตัว
บรรทัดที่ 09 : สร้างตัวแปรชื่อ i และกำหนดให้มีค่าเป็น 0
บรรทัดที่ 10 : พิจารณาค่า r ตั้งแต่ 0 ถึง row - 1
บรรทัดที่ 11 : เพิ่ม array แถวใหม่เข้าไปใน matrixA
บรรทัดที่ 12 : พิจารณาค่า c ตั้งแต่ 0 ถึง col - 1
บรรทัดที่ 13 : แปลง 1D array เป็น 2D array
บรรทัดที่ 14 : เพิ่มค่า i ซึ่งเป็น index ของ arrayA ไปอีก 1
บรรทัดที่ 17 : return matrixA

บรรทัดที่ 19 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 20 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
บรรทัดที่ 21 : print ค่าที่ได้จาก reshape(A, 4, 3)
*/