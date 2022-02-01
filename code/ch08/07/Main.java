import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert F: ");
        double F = sc.nextDouble(); 
        if (F >= 32) {
            double C = 5 * (F - 32) / 9;
            System.out.print(C);
        }
        else {
            System.out.print("cold");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert F: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ F
บรรทัดที่ 08 : ถ้า F มากกว่าหรือเท่ากับ 32 ให้ทำบรรทัดที่ 09-10
บรรทัดที่ 09 : สร้างตัวแปรชื่อ C และกำหนดค่าเท่ากับ 5*(F-32)/9
บรรทัดที่ 10 : พิมพ์ค่า C ออกมา
บรรทัดที่ 12-14 : ถ้า F น้อยกว่า 32 ให้พิมพ์ "cold"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-15.
Line 4 : Main method is where your program starts running, follow line 5-14.
Line 5 : Scanner for user input.

Line 6 : print "Please insert F: ".
Line 7 : Takes double as an input and assigns it to a variable named F.

Line 8 : If F is greater than or equal to 32, follow line 9-10.
Line 9 : Create a variable named C and set a value equal to 5*(F-32)/9.
Line 10 : print the value of C.
Line 12-14 : If F is less than 32, print "cold".

*/