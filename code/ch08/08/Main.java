import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert USD: ");
        double USD = sc.nextDouble(); 
        if (USD > 0) {
            double THB = USD * 32.5;
            System.out.print(THB);
        }
        else {
            System.out.print("you don't have money");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert USD: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ USD
บรรทัดที่ 08 : ถ้า USD มากกว่า 0 ให้ทำบรรทัดที่ 09-10
บรรทัดที่ 09 : สร้างตัวแปรชื่อ THB และกำหนดค่าเท่ากับ USD*32.5
บรรทัดที่ 10 : พิมพ์ค่า THB ออกมา
บรรทัดที่ 12-14 : ถ้า USD น้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ "you don't have money"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-15.
Line 4 : Main method is where your program starts running, follow line 5-14.
Line 5 : Scanner for user input.

Line 6 : print "Please insert USD: ".
Line 7 : Takes double as an input and assigns it to a variable named USD.

Line 8 : If USD is greater than 0, follow line 9-10.
Line 9 : Create a variable named THB and set a value equal to USD*32.5 .
Line 10 : print the value of THB.
Line 12-14 : If USD is less than or equal to 0, print "you don't have money".

*/