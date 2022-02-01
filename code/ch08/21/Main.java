import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert velocity(km/hr): ");
        double velocity = sc.nextDouble(); 
        if (velocity > 120) {
            System.out.print("giving traffic ticket");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert velocity(km/hr): "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ velocity

บรรทัดที่ 08-10 : ถ้า velocity มากกว่า 120 ให้พิมพ์ "giving traffic ticket"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-11.
Line 4 : Main method is where your program starts running, follow line 5-10.
Line 5 : Scanner for user input.

Line 6 : print "Please insert velocity(km/hr): ".
Line 7 : Takes double as an input and assigns it to a variable named velocity.

Line 8-10 : If velocity is greater than 120, print "giving traffic ticket".
*/
