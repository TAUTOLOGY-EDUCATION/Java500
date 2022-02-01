import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number: ");
        int number = sc.nextInt(); 
        if (number % 2 == 0) {
            System.out.print("even number");
        }
        else {
            System.out.print("odd number");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert number: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนเต็มและกำหนดค่าใส่ตัวแปรชื่อ number
บรรทัดที่ 08-10 : ถ้า number หารด้วย 2 ลงตัว ให้พิมพ์ "even number"
บรรทัดที่ 11-13 : ถ้า number หารด้วย 2 ไม่ลงตัว ให้พิมพ์ "odd number"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-14.
Line 4 : Main method is where your program starts running, follow line 5-13.
Line 5 : Scanner for user input.
Line 6 : Print "Please insert number: "
Line 7 : Takes integer as an input and assigns it to a variable named number.
Line 8-10 : If number is divisible by 2, print "even number".
Line 11-13 : If number is not divisible by 2, print "odd number"
*/