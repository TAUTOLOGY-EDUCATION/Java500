import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a: ");
        double a = sc.nextDouble();
        System.out.print("Please insert b: ");
        double b = sc.nextDouble(); 
        System.out.print("Please insert c: ");
        double c = sc.nextDouble(); 
        if (a + b > c) {
            System.out.print("a + b > c");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert a: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ a
บรรทัดที่ 08 : พิมพ์ "Please insert b: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ b
บรรทัดที่ 10 : พิมพ์ "Please insert c: "
บรรทัดที่ 11 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ c
บรรทัดที่ 12-14 : ถ้า a+b มากกว่า c ให้พิมพ์ "a + b > c"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-15.
Line 4 : Main method is where your program starts running, follow line 5-14.
Line 5 : Scanner for user input.

Line 6 : print "Please insert a: ".
Line 7 : Takes double as an input and assigns it to a variable named a.
Line 8 : print "Please insert b: ".
Line 9 : Takes double as an input and assigns it to a variable named b.
Line 10 : print "Please insert c: ".
Line 11 : Takes double as an input and assigns it to a variable named c.

Line 12-14 : If a+b is greater than c, print "a + b > c".
*/