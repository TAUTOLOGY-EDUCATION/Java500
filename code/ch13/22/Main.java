public class Main {
    static int calculator(int a, int b, char op) {
        int result = 0;
        if (op == '+') {
            result = a + b;
        }
        else if (op == '-') {
            result = a - b;
        }
        else if (op == '*') {
            result = a * b;
        }
        else if (op == '/') {
            result = a / b;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculator(5, 2, '*'));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ calculator ที่รับ parameter เป็น a, b และ op
บรรทัดที่ 03 :สร้างตัวแปรชื่อ result ให้ค่าเป็น 0
บรรทัดที่ 04-06 : ถ้า op เป็นเครื่องหมายบวก ให้ result = a + b
บรรทัดที่ 07-09 : ถ้า op เป็นเครื่องหมายลบ ให้ result = a - b
บรรทัดที่ 10-12 : ถ้า op เป็นเครื่องหมายคูณ ให้ result = a * b
บรรทัดที่ 13-15 : ถ้า op เป็นเครื่องหมายหาร ให้ result = a / b
บรรทัดที่ 16 : return result ออกมา

บรรทัดที่ 18 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 19 : print ค่าที่ได้จาก calculator(5, 2, '*')
*/