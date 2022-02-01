import java.util.ArrayList;
import java.util.Arrays;

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
    static ArrayList<Boolean> isPrimeList(ArrayList<Integer> arrayA) {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        for (int a: arrayA) {
            result.add(isPrime(a));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(isPrimeList(A));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ isPrime ที่รับ parameter num
บรรทัดที่ 06-08 : ถ้า num น้อยกว่าหรือเท่ากับ 1 ให้ return false เพราะ num ไม่เป็น prime number
บรรทัดที่ 09-13 : พิจารณาค่า i ตั้งแต่ 2 ถึง num - 1 ถ้า num หารด้วย i ลงตัว ให้ return false เพราะ num ไม่เป็น prime number
บรรทัดที่ 14 : return true เพราะ num เป็น prime number

บรรทัดที่ 16 : ประกาศฟังก์ชันชื่อ isPrimeList ที่รับ parameter arrayA
บรรทัดที่ 17 : สร้างตัวแปรชื่อ result และกำหนดให้เป็น empty array
บรรทัดที่ 18-20 : พิจารณาสมาชิกแต่ละตัวใน arrayA ตรวจสอบจำนวนเฉพาะโดยเรียกใช้ isPrime(a) แล้วนำ a ไปใส่ใน result
บรรทัดที่ 21 : return result ออกมา

บรรทัดที่ 23 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 24 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {1, 2, 3, 4, 5}
บรรทัดที่ 25 : print ค่าที่ได้จาก isPrimeList(A)
*/