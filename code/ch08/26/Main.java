import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert score: ");
        int score = sc.nextInt(); 
        if (score >= 80) {
            System.out.print("A");
        }
        else if (score >= 70) {
            System.out.print("B");
        }
        else if (score >= 60) {
            System.out.print("C");
        }
        else if (score >= 50) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
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

บรรทัดที่ 08-10 : ถ้า score มีค่าตั้งแต่ 80 ขึ้นไป ให้พิมพ์ "A"
บรรทัดที่ 11-13 : ถ้า score มีค่าตั้งแต่ 70 ถึง 79 ให้พิมพ์ "B"
บรรทัดที่ 14-16 : ถ้า score มีค่าตั้งแต่ 60 ถึง 69 ให้พิมพ์ "C"
บรรทัดที่ 17-19 : ถ้า score มีค่าตั้งแต่ 50 ถึง 59 ให้พิมพ์ "D"
บรรทัดที่ 20-22 : ถ้า score มีค่าน้อยกว่า 50 ให้พิมพ์ "F"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-23.
Line 4 : Main method is where your program starts running, follow line 5-22.
Line 5 : Scanner for user input.

Line 6 : print "Please insert score: ".
Line 7 : Takes integer as an input and assigns it to a variable named score.

Line 8-10 : If score is greater than or equal to 80, print "A".
Line 11-13 : If score is greater than or equal to 70 but lower than 80, print "B".
Line 14-16 : If score is greater than or equal to 60 but lower than 70, print "C".
Line 17-19 : If score is greater than or equal to 50 but lower than 60, print "D".
Line 20-22 : Else, print "F".
*/