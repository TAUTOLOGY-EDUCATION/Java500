import java.util.HashMap;

public class Main {
    static String toHexadecimal(int x) {
        HashMap<Integer, Character> converter = new HashMap<Integer, Character>();
        for (int i = 0; i < 16; i++) {
            if (i < 10) {
                converter.put(i, (char)('0' + i));
            }
            else {
                converter.put(i, (char)('A' + i - 10));
            }
        }
        String hex = "";
        while (x > 0) {
            hex = converter.get(x % 16) + hex;
            x /= 16;
        }
        return hex;
    }
    public static void main(String[] args) {
        System.out.println(toHexadecimal(318));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ HashMap

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ประกาศฟังก์ชันชื่อ toHexadecimal ที่รับ parameter เป็น x
บรรทัดที่ 05 : สร้างตัวแปรชื่อ converter และมีค่าเริ่มต้นเท่ากับ empty map
บรรทัดที่ 06-13 : ทำการวนลูปเพื่อกำหนดค่าให้ตัวแปร converter = {0: '0', 1: '1', ..., 14: 'E', 15: 'F'}
บรรทัดที่ 14 : สร้างตัวแปรชื่อ hex และกำหนดค่าเท่ากับ empty string
บรรทัดที่ 15-18 : แปลงเลขฐาน 10 ไปเป็น ฐาน 16 เก็บค่าไว้ในตัวแปร hex
บรรทัดที่ 19 : return hex ออกมา

บรรทัดที่ 21 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 22 : print ค่าที่ได้จาก toHexadecimal(318)
*/