import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert isMember: ");
        String isMember = sc.nextLine();
        System.out.print("Please insert bill: ");
        double bill = sc.nextDouble();
        double discount;
        if (isMember.equals("yes")) {
            if (bill >= 5000) {
                discount = bill * 0.15;
            }
            else if (bill >= 1000) {
                discount = bill * 0.10;
            }
            else if (bill >= 500) {
                discount = bill * 0.05;
            }
            else {
                discount = 0;
            }
            System.out.print(discount);
        }
        else if (isMember.equals("no")) {
            discount = 0;
            System.out.print(discount);
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert isMember: "
บรรทัดที่ 07 : รับอินพุตที่เป็นสายอักขระและกำหนดค่าใส่ตัวแปรชื่อ isMember
บรรทัดที่ 08 : พิมพ์ "Please insert bill: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ bill
บรรทัดที่ 10 : สร้างตัวแปรชื่อ discount เพื่อเก็บจำนวนจริง

บรรทัดที่ 11 : ถ้า isMember เป็น "yes" ให้ทำบรรทัดที่ 12-24
บรรทัดที่ 12-14 : ถ้า bill มีค่าตั้งแต่ 5000 ขึ้นไป ให้คำนวณราคาสินค้าที่ลดไป 15% และเก็บไว้ในตัวแปร discount
บรรทัดที่ 15-17 : ถ้า bill มีค่าตั้งแต่ 1000 แต่ไม่ถึง 5000 ให้คำนวณราคาสินค้าที่ลดไป 10% และเก็บไว้ในตัวแปร discount
บรรทัดที่ 18-20 : ถ้า bill มีค่าตั้งแต่ 500 แต่ไม่ถึง 1000 ให้ ให้คำนวณราคาสินค้าที่ลดไป 5% และเก็บไว้ในตัวแปร discount
บรรทัดที่ 21-23 : ถ้า bill น้อยกว่า 500 ให้ discount เป็น 0
บรรทัดที่ 24 : พิมพ์ค่า discount ออกมา
บรรทัดที่ 26-29 : ถ้า isMember เป็น "no" ให้ discount เป็น 0 และ พิมพ์ค่า discount ออกมา
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-30.
Line 4 : Main method is where your program starts running, follow line 5-29.
Line 5 : Scanner for user input.

Line 6 : print "Please insert isMember: ".
Line 7 : Takes string as an input and assigns it to a variable named isMember.
Line 8 : print "Please insert bill: ".
Line 9 : Takes double as an input and assigns it to a variable named bill.
Line 10 : declare a double varible name discount

Line 11 : If isMember is "yes", follow line 12-24.
Line 12-14 : If bill is greater than or equal to 5,000, calculate the 15% discounted price and store it in the variable named discount.
Line 15-17 : If bill is greater than or equal to 1,000 but less than 5,000, calculate the 10% discounted price and store it in the variable named discount.
Line 18-20 : If bill is greater than or equal to 500 but less than 1,000, calculate the 5% discounted price and store it in the variable named discount.
Line 21-23 : If bill is less than 500, set the discount to 0.
Line 24 : Print discount.
Line 26-29 : If isMember is "no", set the discount to 0 and print the value of discount.
*/