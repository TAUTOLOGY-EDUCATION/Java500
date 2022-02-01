import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert listen time(hour): ");
        double listenTime = sc.nextDouble(); 
        if (listenTime > 4) {
            System.out.print("Listening to music for too long may harm your ears");
        }
        else {
            System.out.print("Have fun listening to music");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert listen time(hour): "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ listenTime

บรรทัดที่ 08-10 : ถ้า listenTime มากกว่า 4 ให้พิมพ์ "Listening to music for too long may harm your ears"
บรรทัดที่ 11-13 : ถ้าไม่ใช่ ให้พิมพ์ "Have fun listening to music"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-11.
Line 4 : Main method is where your program starts running, follow line 5-10.
Line 5 : Scanner for user input.

Line 6 : print "Please insert listen time(hour): ".
Line 7 : Takes double as an input and assigns it to a variable named listenTime.

Line 8-10 : If listenTime is greater than 4, print "Listening to music for too long may harm your ears".
Line 11-13 : Else, print "Have fun listening to music".
*/