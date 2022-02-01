import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert gender: ");
        String gender = sc.nextLine();
        System.out.print("Please insert weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Please insert height (cm): ");
        int height = sc.nextInt();
        if (gender.equals("male")) {
            if (weight > height - 100) {
                System.out.print("Should exercise");
            }
            else {
                System.out.print("You have a great figure");
            }
        }
        else if (gender.equals("female")) {
            if (weight > height - 110) {
                System.out.print("Should exercise");
            }
            else {
                System.out.print("You have a great figure");
            } 
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert gender: "
บรรทัดที่ 07 : รับอินพุตที่เป็นสายอักขระและกำหนดค่าใส่ตัวแปรชื่อ gender
บรรทัดที่ 08 : พิมพ์ "Please insert weight: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ weight
บรรทัดที่ 10 : พิมพ์ "Please insert height: "
บรรทัดที่ 11 : รับอินพุตที่เป็นจำนวนเต็มและกำหนดค่าใส่ตัวแปรชื่อ height

บรรทัดที่ 12 : ถ้า gender เป็น ‘ชาย’ ให้ทำบรรทัดที่ 13-18
บรรทัดที่ 13-15 : ถ้า weight มากกว่า height - 100 ให้พิมพ์ "Should exercise"
บรรทัดที่ 16-18 : ถ้าไม่ใช่ ให้พิมพ์ "You have a great figure"
บรรทัดที่ 20 : ถ้า gender เป็น ‘หญิง’ ให้ทำบรรทัดที่ 21-26
บรรทัดที่ 21-23 : ถ้า weight มากกว่า height - 110 ให้พิมพ์ "Should exercise"
บรรทัดที่ 24-26 : ถ้าไม่ใช่ ให้พิมพ์ "You have a great figure"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-29.
Line 4 : Main method is where your program starts running, follow line 5-28.
Line 5 : Scanner for user input.

Line 6 : print "Please insert gender: ".
Line 7 : Takes string as an input and assigns it to a variable named gender.
Line 8 : print "Please insert weight (kg): ".
Line 9 : Takes double as an input and assigns it to a variable named weight.
Line 10 : print "Please insert height (cm): ".
Line 11 : Takes integer as an input and assigns it to a variable named height.

Line 12 : If gender is "male", follow line 13-18.
Line 13-15 : If weight is greater than height - 100. print "Should exercise".
Line 16-18 : Else, print "You have a great figure".
Line 20 : If gender is "female", follow line 21-26.
Line 21-23 : If weight is greater than height - 110. print "Should exercise".
Line 24-26 : Else, print "You have a great figure".
*/
