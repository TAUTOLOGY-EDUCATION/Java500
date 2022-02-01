public class Main {
    static double distanceR2(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return distance;
    }
    public static void main(String[] args) {
        System.out.println(distanceR2(3, 4, 6, 8));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ distanceR2 ที่รับ parameter เป็น x1, y1, x2 และ y2
บรรทัดที่ 03 : สร้างตัวแปรชื่อ distance สำหรับหาระยะห่าง ซึ่งคำนวณได้ตามสูตรข้างต้น
บรรทัดที่ 04 : return distance ออกมา

บรรทัดที่ 06 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 07 : print ค่าที่ได้จาก distanceR2(3, 4, 6, 8)
*/