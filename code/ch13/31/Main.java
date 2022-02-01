import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int min, max;
    static void findMinMax(ArrayList<Integer> arrayA) {
        min = arrayA.get(0);
        max = arrayA.get(0);
        for (int i: arrayA) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(19, 1, 32, -18));
        findMinMax(A);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : สร้างตัวแปรชื่อ min และ max

บรรทัดที่ 06 : ประกาศฟังก์ชันชื่อ findMinMax ที่รับ parameter เป็น arrayA, min และ max
บรรทัดที่ 07 : สร้างตัวแปรชื่อ min และกำหนดให้เป็น สมาชิกตัวแรกของ arrayA
บรรทัดที่ 08 : สร้างตัวแปรชื่อ max และกำหนดให้เป็น สมาชิกตัวแรกของ arrayA
บรรทัดที่ 09 : พิจารณาสมาชิกแต่ละตัวของ arrayA
บรรทัดที่ 10-12 : ถ้าสมาชิกที่ i ของ arrayA มีค่าน้อยกว่า min ให้ min เท่ากับสมาชิกตัวนั้น
บรรทัดที่ 13-15 : ถ้าสมาชิกที่ i ของ arrayA มีค่ามากกว่า max ให้ max เท่ากับสมาชิกตัวนั้น

บรรทัดที่ 18 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 19 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {19, 1, 32, -18}
บรรทัดที่ 20 : เรียกใช้ฟังก์ชัน findMinMax(A, min, max)
บรรทัดที่ 21 : print min
บรรทัดที่ 22 : print max
*/