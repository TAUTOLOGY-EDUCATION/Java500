import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert order: ");
        String order = sc.nextLine(); 
        if (order.equals("scrambled egg")) {
            System.out.print("recommended to order with boiled egg soup");
        }
        else if (order.equals("omelet")) {
            System.out.print("recommended to order with egg with tamarind sauce");
        }
        else if (order.equals("egg Benedict")) {
            System.out.print("recommended to order with spicy fried egg salad");
        }
        else {
            System.out.print("Our restaurant has only scrambled eggs, omelettes, and eggs Benedict");
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert order: "
บรรทัดที่ 07 : รับอินพุตที่เป็นสายอักขระและกำหนดค่าใส่ตัวแปรชื่อ order

บรรทัดที่ 08-10 : ถ้า order เป็น "scrambled egg" ให้พิมพ์ "recommended to order with boiled egg soup"
บรรทัดที่ 11-13 : ถ้า order เป็น "omelet" ให้พิมพ์ "recommended to order with egg with tamarind sauce"
บรรทัดที่ 14-16 : ถ้า order เป็น "egg Benedict" ให้พิมพ์ "recommended to order with spicy fried egg salad"
บรรทัดที่ 17-19 : ถ้า order เป็นอื่น ๆ ให้พิมพ์ "Our restaurant has only scrambled eggs, omelettes, and eggs Benedict"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-20.
Line 4 : Main method is where your program starts running, follow line 5-19.
Line 5 : Scanner for user input.

Line 6 : print "Please insert order: ".
Line 7 : Takes string as an input and assigns it to a variable named order.

Line 8-10 : If order is "scrambled egg", print "recommended to order with boiled egg soup".
Line 11-13 : If order is "omelet", print "recommended to order with egg with tamarind sauce".
Line 14-16 : If order is "egg Benedict", print "recommended to order with spicy fried egg salad".
Line 17-29 : Else, print "Our restaurant has only scrambled eggs, omelettes, and eggs Benedict".
*/