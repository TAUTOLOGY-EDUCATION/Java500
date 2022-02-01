public class Main {
    static boolean isTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(isTriangle(5, 3, 4));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ isTriangle ที่รับ parameter เป็น a, b และ c
บรรทัดที่ 03-05 : ถ้า 2 ด้านของสามเหลี่ยมรวมกันแล้ว น้อยกว่าหรือเท่ากับ อีกด้านหนึ่งของสามเหลี่ยม return false
บรรทัดที่ 06-08 : ถ้าเป็นเงื่อนไข if เป็นเท็จ return true

บรรทัดที่ 10 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 11 : print ค่าที่ได้จาก isTriangle(5, 3, 4)
*/