public class Main {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(37));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ isPrime ที่รับ parameter num
บรรทัดที่ 03-05 : ถ้า num น้อยกว่าหรือเท่ากับ 1 ให้ return false เพราะ num ไม่เป็น prime number
บรรทัดที่ 06-10 : พิจารณาค่า i ตั้งแต่ 2 ถึง num - 1 ถ้า num หารด้วย i ลงตัว ให้ return false เพราะ num ไม่เป็น prime number
บรรทัดที่ 11 : return true เพราะ num เป็น prime number

บรรทัดที่ 13 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 14 : print ค่าที่ได้จาก isPrime(37)
*/