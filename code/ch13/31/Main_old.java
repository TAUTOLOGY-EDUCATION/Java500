import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int findMin(ArrayList<Integer> listA) {
        int min = listA.get(0);
        for (int i: listA) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    static int findMax(ArrayList<Integer> listA) {
        int max = listA.get(0);
        for (int i: listA) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(19, 1, 32, -18));
        System.out.println("min = " + findMin(A));
        System.out.println("max = " + findMax(A));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ findMin ที่รับ parameter เป็น listA
บรรทัดที่ 06 : สร้างตัวแปรชื่อ min และกำหนดให้เป็น สมาชิกตัวแรกของ listA
บรรทัดที่ 07-11 : พิจารณาค่า i ตั้งแต่ 0 ถึง n-1 ถ้าสมาชิกตำแหน่งที่ i ของ listA มีค่าน้อยกว่า min ให้ min เท่ากับสมาชิกตัวนั้น
บรรทัดที่ 12 : return min ออกมา

บรรทัดที่ 14 : ประกาศฟังก์ชันชื่อ findMax ที่รับ parameter เป็น listA
บรรทัดที่ 15 : สร้างตัวแปรชื่อ max และกำหนดให้เป็น สมาชิกตัวแรกของ listA
บรรทัดที่ 16-20 : พิจารณาค่า i ตั้งแต่ 0 ถึง n-1 ถ้าสมาชิกตำแหน่งที่ i ของ listA มีค่ามากกว่า max ให้ max เท่ากับสมาชิกตัวนั้น
บรรทัดที่ 21 : return max ออกมา

บรรทัดที่ 23 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 24 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {19, 1, 32, -18}
บรรทัดที่ 25 : print ค่าที่ได้จาก findMin(A)
บรรทัดที่ 26 : print ค่าที่ได้จาก findMax(A)
*/