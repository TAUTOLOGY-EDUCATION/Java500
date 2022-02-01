import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert num1: ");
        double num1 = sc.nextDouble(); 
        System.out.print("Please insert num2: ");
        double num2 = sc.nextDouble(); 
        if (num1 > num2) {
            System.out.print(num1);
        }
        else if (num2 > num1) {
            System.out.print(num2);
        }
        else {
            System.out.print("equal");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert num1: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ num1
บรรทัดที่ 08 : พิมพ์ "Please insert num2: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ num2
บรรทัดที่ 10-12 : ถ้า num1 มากกว่า num2 ให้พิมพ์ค่า num1 ออกมา
บรรทัดที่ 13-15 : ถ้า num2 มากกว่า num1 ให้พิมพ์ค่า num2 ออกมา
บรรทัดที่ 16-18 : ถ้า num1 เท่ากับ num2 ให้พิมพ์ "equal"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-19.
Line 4 : Main method is where your program starts running, follow line 5-18.
Line 5 : Scanner for user input.

Line 6 : print "Please insert num1: ".
Line 7 : Takes double as an input and assigns it to a variable named num1.
Line 8 : print "Please insert num2: ".
Line 9 : Takes double as an input and assigns it to a variable named num2.

Line 10-12 : If num1 is greater than num2, print the vaule of num1.
Line 13-15 : If num2 is greater than num1, print the vaule of num2.
Line 16-18 : If num1 is equal to num2, print "equal".
*/