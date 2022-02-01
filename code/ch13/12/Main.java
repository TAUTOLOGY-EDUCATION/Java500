import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int sumLen(ArrayList<String> arrayA) {
        int sumx = 0;
        for (String s: arrayA) {
            sumx += s.length();
        }
        return sumx;
    }
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>(Arrays.asList("food", "drink", "snack", "vegetable"));
        System.out.println(sumLen(A));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ sumLen ที่รับ parameter เป็น arrayA 
บรรทัดที่ 06 : สร้างตัวแปรชื่อ sumx และกำหนดให้เป็น 0
บรรทัดที่ 07-09 : พิจารณาสมาชิกแต่ละตัวของ arrayA ในชื่อตัวแปร s นำความยาวของ a ไปบวกเพิ่มที่ sumx
บรรทัดที่ 10 : return sumx ออกมา

บรรทัดที่ 12 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 13 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {"food", "drink", "snack", "vegetable"}
บรรทัดที่ 14 : print ค่าที่ได้จาก sumLen(A)
*/