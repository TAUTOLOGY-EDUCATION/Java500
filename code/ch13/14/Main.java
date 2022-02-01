public class Main {
    static int distanceR1(int x1, int x2) {
        return Math.abs(x1 - x2);
    }
    public static void main(String[] args) {
        System.out.println(distanceR1(32, -18));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ distanceR1 ที่รับ parameter เป็น x1 และ x2
บรรทัดที่ 03 : return ค่า absolute ของผลต่างระหว่าง x1 และ x2

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก distanceR1(32, -18)
*/