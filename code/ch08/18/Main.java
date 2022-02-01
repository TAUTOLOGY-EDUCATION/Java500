import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert bill: ");
        int bill = sc.nextInt();
        System.out.print("Please insert hour: ");
        int hour = sc.nextInt();
        System.out.print("Please insert minute: ");
        int minute = sc.nextInt();
        double fee;
        if (minute > 0) { 
            hour = hour + 1;
        }
        if (bill >= 1000) {
            fee = (hour - 4) * 30;
            if (fee < 0) {
                fee = 0;
            }
        }
        else {
            fee = (hour - 1) * 30;
        }
        System.out.print(fee);
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert bill: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ bill
บรรทัดที่ 08 : พิมพ์ "Please insert hour: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ hour
บรรทัดที่ 10 : พิมพ์ "Please insert minute: "
บรรทัดที่ 11 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ minute
บรรทัดที่ 12 : สร้างตัวแปรชื่อ fee เพื่อเก็บจำนวนจริง
บรรทัดที่ 13-15 : ถ้า minute มากกว่า 0 ให้เพิ่ม hour ขึ้น 1
บรรทัดที่ 16 : ถ้า bill มากกว่าหรือเท่ากับ 1000 ให้ทำบรรทัดที่ 17-20
บรรทัดที่ 17 : คำนวณค่าจอดรถโดยหักลบ hour ไป 4 ชั่วโมง เก็บไว้ในตัวแปร fee
บรรทัดที่ 18-20 : ถ้า fee น้อยกว่า 0 กำหนดให้ fee เท่ากับ 0
บรรทัดที่ 22 : ถ้า bill น้อยกว่า 1000 ให้ทำบรรทัดที่ 23
บรรทัดที่ 23 : คำนวณค่าจอดรถโดยหักลบ hour ไป 1 ชั่วโมง เก็บไว้ในตัวแปร fee
บรรทัดที่ 25 : พิมพ์ค่า fee ออกมา
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-26.
Line 4 : Main method is where your program starts running, follow line 5-25.
Line 5 : Scanner for user input.

Line 6 : print "Please insert bill: ".
Line 7 : Takes integer as an input and assigns it to a variable named bill.
Line 8 : print "Please insert hour: ".
Line 9 : Takes integer as an input and assigns it to a variable named hour.
Line 10 : print "Please insert minute: ".
Line 11 : Takes integer as an input and assigns it to a variable named minute.
Line 12 : declare a double varibles name fee

Line 13-15 : If minute is greater than 0, add the value of hour by 1.
Line 16 : If bill is greater than or equal to 1,000, follow line 18-21.
Line 17 : Set a variable named fee value equal to hour - 4.
Line 18-20 : If fee is less than 0, set the value to 0.
Line 22 : If bill is less than to 1,000, follow line 24.
Line 23 : Set a variable named fee value equal to hour - 1.
Line 25 : Print fee.
*/