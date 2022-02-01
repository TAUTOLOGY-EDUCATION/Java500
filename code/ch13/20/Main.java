public class Main {
    static double calculateFV(double PV, double r, int n) {
        return  PV * Math.pow(1 + r / 100, n);
    }
    public static void main(String[] args) {
        System.out.println(calculateFV(1000, 20, 2));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ calculateFV ที่รับ parameter เป็น PV, r และ n
บรรทัดที่ 03 : return FV สำหรับหาเงินลงทุนรวม ซึ่งคำนวณได้ตามสูตรข้างต้น ออกมา

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก calculateFV(1000, 20, 2)
*/