import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert currency: ");
        String currency = sc.nextLine();
        System.out.print("Please insert amount: ");
        double amount = sc.nextDouble();
        if (currency.equals("USD")) {
            double THB = amount * 32.5;
            System.out.print(THB);
        }
        else if (currency.equals("JPY")) {
            double THB = amount * 0.29;
            System.out.print(THB);
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert currency: "
บรรทัดที่ 07 : รับอินพุตที่เป็นสายอักขระและกำหนดค่าใส่ตัวแปรชื่อ currency
บรรทัดที่ 08 : พิมพ์ "Please insert amount: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ amount

บรรทัดที่ 10 : ถ้า currency เป็น "USD" ให้ทำบรรทัดที่ 11-12
บรรทัดที่ 11 : สร้างตัวแปรชื่อ THB และกำหนดค่าเท่ากับ amount*32.5
บรรทัดที่ 12 : พิมพ์ค่า THB ออกมา
บรรทัดที่ 14 : ถ้า currency เป็น "JPY" ให้ทำบรรทัดที่ 15-16
บรรทัดที่ 15 : สร้างตัวแปรชื่อ THB และกำหนดค่าเท่ากับ amount*0.29
บรรทัดที่ 16 : พิมพ์ค่า THB ออกมา
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-30.
Line 4 : Main method is where your program starts running, follow line 5-29.
Line 5 : Scanner for user input.

Line 6 : print "Please insert currency: ".
Line 7 : Takes string as an input and assigns it to a variable named currency.
Line 8 : print "Please insert amount: ".
Line 9 : Takes double as an input and assigns it to a variable named amount.

Line 10 : If currency is "USD", follow line 11-12.
Line 11 : Create a variable named THB and set a value equal to amount*32.5
Line 12 : Print THB.
Line 14 : If currency is "JPY", follow line 15-16.
Line 15 : Create a variable named THB and set a value equal to amount*0.29
Line 16 : Print THB.
*/