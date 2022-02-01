import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static ArrayList<Integer> derivative(ArrayList<Integer> arrayA) {
        ArrayList<Integer> diff = new ArrayList<Integer>(Collections.nCopies(arrayA.size(), 0));
        for (int i = 1; i < arrayA.size(); i++) {
            diff.set(i - 1, arrayA.get(i) * i);
        }
        return diff;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 3, 0, 1));
        System.out.println(derivative(A));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays
บรรทัดที่ 03 : import library ชื่อ Collections

บรรทัดที่ 05 : ประกาศ class ชื่อ Main

บรรทัดที่ 06 : ประกาศฟังก์ชันชื่อ derivative ที่รับ parameter เป็น arrayA
บรรทัดที่ 07 : สร้างตัวแปรชื่อ diff และกำหนดให้ มีขนาดเท่ากับ arrayA มีค่าเริ่มต้นเป็น 0 ในทุกตัว
บรรทัดที่ 08 : พิจารณา index ใน arrayA โดยเริ่มจาก index 1 จนถึงสุดท้าย เนื่องจาก index 0 จะทำการ diff แล้วมีค่าเป็น 0 เสมอ เพราะเป็นค่าคงที่
บรรทัดที่ 09 : เก็บสัมประสิทธิ์ของค่า derivatives ใส่ใน diff
บรรทัดที่ 11 : return diff ออกมา

บรรทัดที่ 13 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 14 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {2, 3, 0, 1}
บรรทัดที่ 15 : print ค่าที่ได้จาก derivative(A)
*/