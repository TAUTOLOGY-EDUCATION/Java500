public class Main {
    static double calculateC(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public static void main(String[] args) {
        System.out.println(calculateC(3, 4));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ calculateC ที่รับ parameter เป็น a และ b
บรรทัดที่ 03 : return c ความยาวด้านตรงข้ามมุมฉาก ซึ่งคำนวณได้ตามสูตรข้างต้น ออกมา

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก calculateC(3, 4)
*/