import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert AD: ");
        int AD = sc.nextInt(); 
        if (AD >= 0) {
            int BE = AD + 543;
            System.out.print(BE);
        }
        else {
            System.out.print("please enter a number that is greater than or equal to 0");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert AD: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนเต็มและกำหนดค่าใส่ตัวแปรชื่อ AD
บรรทัดที่ 08 : ถ้า AD มากกว่าเท่ากับ 0 ให้ทำบรรทัดที่ 09-10
บรรทัดที่ 09 : สร้างตัวแปรชื่อ BE และกำหนดค่าเท่ากับ AD + 543
บรรทัดที่ 10 : พิมพ์ค่า BE ออกมา
บรรทัดที่ 12-14 : ถ้า AD น้อยกว่า 0 ให้พิมพ์ "please enter a number that is greater than or equal to 0"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-17.
Line 4 : Main method is where your program starts running, follow line 5-16.
Line 5 : Scanner for user input.

Line 6 : print "Please insert AD: ".
Line 7 : Takes integer as an input and assigns it to a variable named AD.

Line 8 : If AD is greater than or equal to 0, follow line 9-10
Line 9 : Create a variable named BE and set a value equal to AD + 543.
Line 10 : print the value of BE.
Line 12-14 : If AD is less than 0, print "please enter a number that is greater than or equal to 0".

*/