import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert width: ");
        int width = sc.nextInt(); 
        System.out.print("Please insert length: ");
        int length = sc.nextInt(); 
        if (width <= 0 || length <= 0) {
            System.out.print("please enter positive integer");
        }
        else {
            int area = width * length;
            System.out.print(area);
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert width: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนเต็มและกำหนดค่าใส่ตัวแปรชื่อ length
บรรทัดที่ 08 : พิมพ์ "Please insert length: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนเต็มและกำหนดค่าใส่ตัวแปรชื่อ length
บรรทัดที่ 10-12 : ถ้า width หรือ length น้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ "please enter positive integer"
บรรทัดที่ 13 : ถ้าไม่ใช่ ให้ทำบรรทัดที่ 14-15
บรรทัดที่ 14 : สร้างตัวแปรชื่อ area และกำหนดค่าเท่ากับ width*length
บรรทัดที่ 15 : พิมพ์ค่า area ออกมา
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-17.
Line 4 : Main method is where your program starts running, follow line 5-16.
Line 5 : Scanner for user input.

Line 6 : Print "Please insert width: "
Line 7 : Takes integer as an input and assigns it to a variable named width.
Line 8 : Print "Please insert length: "
Line 9 : Takes integer as an input and assigns it to a variable named length.

Line 10-12 : If width or length is less than or equal to 0, print "please enter positive integer".
Line 13 : Else, follow line 14-15.
Line 14 : Create a variable named area and set a value equal to width*length.
Line 15 : print the value of area.

*/