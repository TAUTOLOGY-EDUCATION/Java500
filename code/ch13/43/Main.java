import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<String> delExceedLen(ArrayList<String> arrayA, int n) {
        ArrayList<String> remainArray = new ArrayList<String>();
        for (String a: arrayA) {
            if (a.length() <= n) {
                remainArray.add(a);
            }
        }
        return remainArray;
    }
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>(Arrays.asList("Hello", "Hel", "Hell", "He", "H"));
        System.out.println(delExceedLen(A, 3));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ delExceedLen ที่รับ parameter เป็น arrayA และ n
บรรทัดที่ 06 : สร้างตัวแปรชื่อ remainArray และกำหนดให้เป็น empty array
บรรทัดที่ 07 : พิจารณาสมาชิกแต่ละตัวใน A
บรรทัดที่ 08-10 : ถ้าความยาวของสมาชิกน้อยกว่าหรือเท่ากับ n ก็จะนำไปใส่ใน remainArray
บรรทัดที่ 12 : return remainArray ออกมา

บรรทัดที่ 14 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 15 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {"Hello", "Hel", "Hell", "He", "H"}
บรรทัดที่ 16 : print ค่าที่ได้จาก delExceedLen(A, 3)
*/