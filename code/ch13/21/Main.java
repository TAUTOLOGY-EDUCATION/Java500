public class Main {
    static double calculateR(double PV, double FV, int n) {
        return (Math.pow(FV / PV, 1.0 / n) - 1) * 100;
    }
    public static void main(String[] args) {
        System.out.println(calculateR(1000, 1440, 2));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ calculateR ที่รับ parameter เป็น PV, FV และ n
บรรทัดที่ 03 : return r สำหรับหาอัตราผลตอบแทน ซึ่งคำนวณได้ตามสูตรข้างต้น ออกมา

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก calculateR(1000, 1440, 2)
*/