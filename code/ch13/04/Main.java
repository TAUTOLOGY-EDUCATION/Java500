import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Integer> squareList(ArrayList<Integer> arrayA) {
        ArrayList<Integer> square = new ArrayList<Integer>();
        for (int a: arrayA) {
            square.add(a * a);
        }
        return square;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(squareList(A));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ squareList ที่รับ parameter เป็น arrayA 
บรรทัดที่ 06 : สร้างตัวแปรชื่อ square และกำหนดให้เป็น empty array
บรรทัดที่ 07-09 : นำสมาชิกแต่ละตัวใน arrayA มายกกำลังสอง แล้วนำไปใส่ใน square
บรรทัดที่ 10 : return square ออกมา

บรรทัดที่ 12 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 13 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {1, 2, 3, 4, 5}
บรรทัดที่ 14 : print ค่าที่ได้จาก squareList(A)
*/