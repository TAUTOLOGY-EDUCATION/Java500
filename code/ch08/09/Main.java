import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert THB: ");
        double THB = sc.nextDouble(); 
        if (THB > 0) {
            double USD = THB / 32.8;
            double bankProfit = USD * 0.3;
            System.out.println("USD: " + USD);
            System.out.println("profit: " + bankProfit);
        }
        else {
            System.out.print("you don't have money");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert THB: "
บรรทัดที่ 07 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ THB
บรรทัดที่ 08 : ถ้า THB มากกว่า 0 ให้ทำบรรทัดที่ 09-12
บรรทัดที่ 09 : สร้างตัวแปรชื่อ USD และกำหนดค่าเท่ากับ THB/32.8
บรรทัดที่ 10 : สร้างตัวแปรชื่อ bank_profit และกำหนดค่าเท่ากับ USD*0.3
บรรทัดที่ 11 : พิมพ์ค่า USD ออกมา
บรรทัดที่ 12 : พิมพ์ค่า bank_profit ออกมา
บรรทัดที่ 14-16 : ถ้า THB น้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ "you don't have money"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-17.
Line 4 : Main method is where your program starts running, follow line 5-16.
Line 5 : Scanner for user input.

Line 6 : print "Please insert THB: ".
Line 7 : Takes double as an input and assigns it to a variable named THB.

Line 8 : If THB is greater than 0, follow line 9-12.
Line 9 : Create a variable named USD and set a value equal to THB/32.8
Line 10 : Create a variable named bankProfit and set a value equal to USD*0.3
Line 11 : print the value of USD.
Line 12 : print the value of bankProfit.
Line 14-16 : If THB is less than or equal to 0, print "you don't have money".

*/