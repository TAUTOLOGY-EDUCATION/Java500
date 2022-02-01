public class Main {
    static String toBinary(int x) {
        String binary = "";
        while (x > 0) {
            binary = (char)('0' + (x % 2)) + binary;
            x /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println(toBinary(13));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ toBinary ที่รับ parameter เป็น x
บรรทัดที่ 03 : สร้างตัวแปรชื่อ binary และมีค่าเริ่มต้นเท่ากับ empty string
บรรทัดที่ 04-07 : แปลงเลขฐาน 10 ไปเป็น ฐาน 2 เก็บค่าไว้ในตัวแปร binary
บรรทัดที่ 08 : return binary ออกมา

บรรทัดที่ 10 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 11 : print ค่าที่ได้จาก toBinary(13)
*/