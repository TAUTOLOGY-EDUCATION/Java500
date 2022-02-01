import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert score: ");
        int score = sc.nextInt(); 
        if (score >= 50) {
            System.out.print("Pass");
        }
        else {
            System.out.print("Fail");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert score: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ score

บรรทัดที่ 08-10 : ถ้า score มากกว่าหรือเท่ากับ 50 ให้พิมพ์ "Pass"
บรรทัดที่ 11-13 : ถ้า score น้อยกว่า 50 ให้พิมพ์ "Fail"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-14.
Line 4 : Main method is where your program starts running, follow line 5-13.
Line 5 : Scanner for user input.

Line 6 : print "Please insert score: ".
Line 7 : Takes integer as an input and assigns it to a variable named score.

Line 8-10 : If score is greater than or equal to 50, print "Pass".
Line 11-13 : If score is less than 50, print "Fail".
*/