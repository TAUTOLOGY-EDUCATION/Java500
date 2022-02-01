import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static double sumArray(ArrayList<Double> arrayA) {
        double sumx = 0;
        for (double a: arrayA) {
            sumx = sumx + a;
        }
        return sumx;
    }
    public static void main(String[] args) {
        ArrayList<Double> A = new ArrayList<Double>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        System.out.println(sumArray(A));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ sumArray ที่รับ parameter เป็น arrayA 
บรรทัดที่ 06 : สร้างตัวแปรชื่อ sumx และกำหนดค่าเท่ากับ 0
บรรทัดที่ 07-09 : นำสมาชิกแต่ละตัวใน arrayA ไปบวกเพิ่มที่ sumx
บรรทัดที่ 10 : return sumx ออกมา

บรรทัดที่ 12 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 13 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {1.1, 2.2, 3.3, 4.4, 5.5}
บรรทัดที่ 14 : print ค่าที่ได้จาก sumArray(A)
*/
