import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Integer> plus(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arrayA.size(); i++) {
            result.add(arrayA.get(i) + arrayB.get(i));
        }
        return result;
     }
     static ArrayList<Integer> cross(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arrayA.size(); i++) {
            result.add(arrayA.get(i) * arrayB.get(i));
        }
        return result;
     }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> B = new ArrayList<Integer>(Arrays.asList(6, 7, 8));
        System.out.println(plus(A, B));
        System.out.println(cross(A, B));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ plus ที่รับ parameter เป็น arrayA และ arrayB
บรรทัดที่ 06 : สร้างตัวแปรชื่อ result และกำหนดให้เป็น empty array
บรรทัดที่ 07-09 : พิจารณาค่า i ตั้งแต่ 0 ถึง arrayA.size()-1 หาผลบวกของสมาชิกตำแหน่งที่ i ของ arrayA และ arrayB แล้วนำไปใส่ใน result
บรรทัดที่ 10 : return result ออกมา

บรรทัดที่ 12 : ประกาศฟังก์ชันชื่อ cross ที่รับ parameter เป็น arrayA และ arrayB
บรรทัดที่ 13 : สร้างตัวแปรชื่อ result และกำหนดให้เป็น empty array
บรรทัดที่ 14-16 : พิจารณาค่า i ตั้งแต่ 0 ถึง arrayA.size()-1 หาผลคูณของสมาชิกตำแหน่งที่ i ของ arrayA และ arrayB แล้วนำไปใส่ใน result
บรรทัดที่ 17 : return result ออกมา

บรรทัดที่ 19 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 20 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {1, 2, 3}
บรรทัดที่ 21 : สร้างตัวแปรชื่อ B และกำหนดให้เป็น {6, 7, 8}
บรรทัดที่ 22 : print ค่าที่ได้จาก plus(A, B)
บรรทัดที่ 23 : print ค่าที่ได้จาก cross(A, B)
*/