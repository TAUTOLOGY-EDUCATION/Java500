import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Integer> findCusum(ArrayList<Integer> arrayA) {
        int cusum = 0;
        ArrayList<Integer> cusumArray = new ArrayList<Integer>();
        for (int i: arrayA) {
            cusum += i;
            cusumArray.add(cusum);
        }
        return cusumArray;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(8, 0, -2, 4));
        System.out.println(findCusum(A));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ findCusum ที่รับ parameter เป็น arrayA 
บรรทัดที่ 06 : สร้างตัวแปรชื่อ cusum และกำหนดให้เป็น 0
บรรทัดที่ 07 : สร้างตัวแปรชื่อ cusumArray และกำหนดให้เป็น empty array
บรรทัดที่ 08 : พิจารณาสมาชิกของ arrayA แต่ละตัว
บรรทัดที่ 09 : รวมผลบวกสะสมไว้ใน cusum
บรรทัดที่ 10 : นำผลบวกสะสมไปใส่ใน cusumArray
บรรทัดที่ 12 : return cusumArray ออกมา

บรรทัดที่ 14 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 15 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {8, 0, -2, 4}
บรรทัดที่ 16 : print ค่าที่ได้จาก findCusum(A)
*/
