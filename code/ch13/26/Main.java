import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Integer> shiftRight(ArrayList<Integer> arrayA, int k) {
        ArrayList<Integer> shiftArrayA = new ArrayList<Integer>();
        k %= arrayA.size();
        int n = arrayA.size();
        for (int i = n - k; i < n; i++) {
            shiftArrayA.add(arrayA.get(i));
        }
        for (int i = 0; i < n - k; i++) {
            shiftArrayA.add(arrayA.get(i));
        }
        return shiftArrayA;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(shiftRight(A, 1));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ shiftRight ที่รับ parameter เป็น arrayA และ k
บรรทัดที่ 06 : สร้างตัวแปรชื่อ shiftArrayA และกำหนดค่าเท่ากับ empty array
บรรทัดที่ 07 : ทำการ mod k ด้วยความยาวของ arrayA (เนื่องจากถ้าจำนวนครั้งที่ทำการ rotate ไปเท่ากับจำนวนสมาชิกใน arrayA จะทำให้สมาชิกกลับมาอยู่ที่เดิม)
บรรทัดที่ 08 : สร้างตัวแปรชื่อ n และกำหนดค่าเท่ากับ ขนาดของ arrayA
บรรทัดที่ 09-14 : ทำการ shift right arrayA แล้วเก็บค่าไว้ใน shiftArrayA
บรรทัดที่ 15 : return shiftArrayA

บรรทัดที่ 17 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 18 : สร้างตัวแปรชื่อ A และกำหนดค่าเท่ากับ {1, 2, 3, 4, 5}
บรรทัดที่ 19 : print ค่าที่ได้จาก shiftRight(A, 1)
*/