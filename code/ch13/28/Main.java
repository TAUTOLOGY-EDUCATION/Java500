import java.util.HashMap;

public class Main {
    static int toDecimal(String s, int b) {
        HashMap<Character, Integer> converter = new HashMap<Character, Integer>();
        for (int i = 0; i < 16; i++) {
            if (i < 10) {
                converter.put((char)('0' + i), i);
            }
            else {
                converter.put((char)('A' + i - 10), i);
            }
        }
        int decimal = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            decimal += converter.get(s.charAt(i)) * Math.pow(b, s.length() - i - 1);
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(toDecimal("71A", 16));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ HashMap

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ประกาศฟังก์ชันชื่อ toDecimal ที่รับ parameter เป็น s และ b
บรรทัดที่ 05 : สร้างตัวแปรชื่อ converter และมีค่าเริ่มต้นเท่ากับ empty map
บรรทัดที่ 06-13 : ทำการวนลูปเพื่อกำหนดค่าให้ตัวแปร converter = {'0': 0, '1': 1, ..., 'E': 14, 'F': 15}
บรรทัดที่ 14 : สร้างตัวแปรชื่อ decimal และกำหนดค่าเท่ากับ 0 เพื่อเก็บค่าที่แปลงเป็นฐานสิบแล้ว
บรรทัดที่ 15-17 : แปลงค่าในแต่ละหลักมาเป็นฐานสิบแล้วนำไปบวกรวมกัน
บรรทัดที่ 18 : return ค่าฐานสิบ

บรรทัดที่ 20 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 21 : print ค่าที่ได้จาก toDecimal("71A", 16)
*/