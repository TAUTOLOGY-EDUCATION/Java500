import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static String delSpecialChar(String str1) {
        ArrayList<String> specialChar = new ArrayList<String>(Arrays.asList("!", "@", "#", "\\", "$", "%", ","));
        for (String c: specialChar) {
            str1 = str1.replace(c, "");
        }
        return str1;
    }
    
    public static void main(String[] args) {
        System.out.println(delSpecialChar("chicken%"));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ delSpecialChar ที่รับ parameter เป็น str1
บรรทัดที่ 06 : สร้างตัวแปรชื่อ specialChar และกำหนดค่าเท่ากับ {"!", "@", "\\", "%", ","} เพื่อเก็บอักขระพิเศษ
บรรทัดที่ 07-09 : พิจารณาอักขระพิเศษแต่ละตัว และ แทนที่อักขระพิเศษที่ปรากฏใน str1 ด้วย empty string
บรรทัดที่ 10 : return str1 ที่ลบอักขระพิเศษออกแล้ว

บรรทัดที่ 13 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 14 : print ค่าที่ได้จาก delSpecialChar("chicken%")
*/