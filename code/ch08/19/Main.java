import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert bill: ");
        double bill = sc.nextDouble(); 
        double discount;
        if (bill >= 50000) {
            discount = bill * 0.2;
        }
        else if (bill >= 10000) {
            discount = bill * 0.15;
        }
        else if (bill >= 1000) {
            discount = bill * 0.1;
        }
        else {
            discount = 0;
        }
        double pay = bill - discount;
        System.out.print(pay);
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert bill: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ bill
บรรทัดที่ 08 : สร้างตัวแปรชื่อ discount เพื่อเก็บจำนวนจริง
บรรทัดที่ 09-11 : ถ้า bill มากกว่าเท่ากับ 1500 ให้คำนวณราคาสินค้าที่ลดไป 20% แล้วเก็บไว้ในตัวแปร discount
บรรทัดที่ 12-14 : ถ้า bill มีค่ามากกว่า 300 แต่ไม่ถึง 1500 ให้คำนวณราคาสินค้าที่ลดไป 15% แล้วเก็บไว้ในตัวแปร discount
บรรทัดที่ 15-17 : ถ้า bill มีค่ามากกว่า 30 แต่ไม่ถึง 300 ให้คำนวณราคาสินค้าที่ลดไป 10% แล้วเก็บไว้ในตัวแปร discount
บรรทัดที่ 18-20 : ถ้า bill น้อยกว่า 30 ให้ discount เป็น 0
บรรทัดที่ 21 : สร้างตัวแปรชื่อ pay และกำหนดค่าเท่ากับ bill - discount
บรรทัดที่ 22 : พิมพ์ค่า pay ออกมา
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-23.
Line 4 : Main method is where your program starts running, follow line 5-22.
Line 5 : Scanner for user input.

Line 6 : print "Please insert bill: ".
Line 7 : Takes double as an input and assigns it to a variable named bill.
Line 8 : declare a double varibles name discount

Line 9-11 : If bill is greater than 1,500, calculate the 20% discounted price from the bill and store it in the variable named discount.
Line 12-14 : If bill is greater than 300 but less than 1,500, calculate the 15% discounted price from the bill and store it in the variable named discount.
Line 15-17 :If bill is greater than 30 but less than 300, calculate the 10% discounted price from the bill and store it in the variable named discount.
Line 18-20 : If bill is less than 30, set the discount to 0.
Line 21 : Create a variable named pay and set a value equal to bill - discount
Line 22 : Print pay.
*/