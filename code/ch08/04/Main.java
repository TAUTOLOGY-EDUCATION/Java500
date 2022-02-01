import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert number: ");
        int number = sc.nextInt(); 
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.print("positive even");
            }
            else {
                System.out.print("positive odd");
            }
        }
        else if (number < 0) {
            if (number % 2 == 0) {
                System.out.print("negative even");
            }
            else {
                System.out.print("negative odd");
            }
        }
        else {
            System.out.print("zero");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert number: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนเต็มและกำหนดค่าใส่ตัวแปรชื่อ number

บรรทัดที่ 08 : ถ้า number มากกว่า 0 ให้ทำบรรทัดที่ 09-14
บรรทัดที่ 09-11 : ถ้า number หารด้วย 2 ลงตัว ให้พิมพ์ "positive even"
บรรทัดที่ 12-14 : ถ้า number หารด้วย 2 ไม่ลงตัว ให้พิมพ์ "positive odd"
บรรทัดที่ 16 : ถ้า number น้อยกว่า 0 ให้ทำบรรทัดที่ 17-22
บรรทัดที่ 17-19 : ถ้า number หารด้วย 2 ลงตัว ให้พิมพ์ "negative even"
บรรทัดที่ 20-22 : ถ้า number หารด้วย 2 ไม่ลงตัว ให้พิมพ์ "negative odd"
บรรทัดที่ 24-26 : ถ้า number เท่ากับ 0 ให้พิมพ์ "zero"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-27.
Line 4 : Main method is where your program starts running, follow line 4-26.
Line 5 : Scanner for user input.
Line 6 : Print "Please insert number: "
Line 7 : Takes integer as an input and assigns it to a variable named number.

Line 8 : If number is greater than 0, follow line 9-14.
Line 9-11 : If number is divisible by 2, print "positive even".
Line 12-14 : If number is not divisible by 2, print "positive odd".
Line 16 : If number is less than 0, follow line 17-22.
Line 17-19 : If number is divisible by 2, print "negative even".
Line 20-22 : If number is not divisible by 2, print "negative odd".
Line 24 : If number is equal to 0, print "zero".
*/