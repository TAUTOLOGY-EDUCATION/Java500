import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert str1: ");
        String str1 = sc.nextLine(); 
        System.out.print("Please insert str2: ");
        String str2 = sc.nextLine(); 
        if (str1.length() == str2.length()) {
            System.out.print("same");
        }
        else {
            System.out.print("not same");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert str1: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ str1
บรรทัดที่ 08 : พิมพ์ "Please insert str2: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ str2
บรรทัดที่ 10-12 : ถ้าความยาว str1 และ str2 เท่ากัน ให้พิมพ์ "same"
บรรทัดที่ 13-15 : ถ้าความยาว str1 และ str2 ไม่เท่ากัน ให้พิมพ์ "not same"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-16.
Line 4 : Main method is where your program starts running, follow line 5-15.
Line 5 : Scanner for user input.

Line 6 : print "Please insert str1: ".
Line 7 : Takes string as an input and assigns it to a variable named str1.
Line 8 : print "Please insert str2: ".
Line 9 : Takes string as an input and assigns it to a variable named str2.

Line 10-12 : If str1 is equal to str2, print "same".
Line 13-15 : If str1 is not equal to str2, print "not same".
*/