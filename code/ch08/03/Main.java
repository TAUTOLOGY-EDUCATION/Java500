import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number: ");
        double number = sc.nextDouble(); 
        if (number > 0) {
            System.out.print("positive");
        }
        else if (number < 0) {
            System.out.print("negative");
        }
        else {
            System.out.print("zero");
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
บรรทัดที่ 08-10 : ถ้า number มากกว่า 0 ให้พิมพ์ "positive"
บรรทัดที่ 11-13 : ถ้า number น้อยกว่า 0 ให้พิมพ์ "negative"
บรรทัดที่ 14-16 : ถ้า number เท่ากับ 0 ให้พิมพ์ "zero"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3-18 : Main class, everything goes in a class, follow line 4-17.
Line 4-17 : Main method is where your program starts running, follow line 4-16.
Line 5 : Scanner for user input.

Line 6 : Print "Please insert number: "
Line 7 : Takes double as an input and assigns it to a variable named number.

Line 8-10 : If number is greater than 0, print "positive".
Line 11-13 : If number is less than 0, print "negative".
Line 14-16 : If number is equal to 0, print "zero".
*/