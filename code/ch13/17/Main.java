public class Main {
    static double frogJump(double d, double s) {
        return Math.ceil(d / s);
    }   
    public static void main(String[] args) {
        System.out.println(frogJump(10, 2));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ frogJump ที่รับ parameter เป็น d และ s
บรรทัดที่ 03 : return ผลหารระหว่างระยะทางที่ต้องการกระโดด กับ ระยะทางที่ได้จากการกระโดด 1 ครั้ง แล้วทำการปัดเศษขึ้น

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก frogJump(10, 2)
*/