import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert hour: ");
        int hour = sc.nextInt();
        System.out.print("Please insert minute: ");
        int minute = sc.nextInt();
        if (minute > 0) {
            hour = hour + 1;
        }
        int fee = (hour - 1) * 30;
        System.out.print(fee);
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert hour: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ hour
บรรทัดที่ 08 : พิมพ์ "Please insert minute: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ minute
บรรทัดที่ 10-12 : ถ้า minute มากกว่า 0 ให้เพิ่ม hour ขึ้น 1
บรรทัดที่ 13 : สร้างตัวแปรชื่อ fee และกำหนดค่าเท่ากับ (hour - 1)*30
บรรทัดที่ 14 : พิมพ์ค่า fee ออกมา
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-15.
Line 4 : Main method is where your program starts running, follow line 5-14.
Line 5 : Scanner for user input.

Line 6 : print "Please insert hour: ".
Line 7 : Takes integer as an input and assigns it to a variable named hour.
Line 8 : print "Please insert minute: ".
Line 9 : Takes integer as an input and assigns it to a variable named minute.

Line 10-12 : If minute is greater than 0, add the value of hour by 1.
Line 13 : Create a variable named fee and set a value equal to (hour - 1)*2 .
Line 14 : Print fee.
*/