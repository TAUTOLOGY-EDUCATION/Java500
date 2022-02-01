import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert order: ");
        String order = sc.nextLine();
        System.out.print("Please insert amount: ");
        int amount = sc.nextInt();
        if (order.equals("scrambled egg")) {
            int cost = amount * 7;
            System.out.print(cost);
        }
        else if (order.equals("omelet")) {
            int cost = amount * 10;
            System.out.print(cost);
        }
        else if (order.equals("egg Benedict")) {
            int cost = amount * 5;
            System.out.print(cost);
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
บรรทัดที่ 08 : พิมพ์ "Please insert amount: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนเต็มและกำหนดค่าใส่ตัวแปรชื่อ amount

บรรทัดที่ 10 : ถ้า order เป็น "scrambled egg" ให้ทำบรรทัดที่ 11-12
บรรทัดที่ 11 : สร้างตัวแปรชื่อ cost และกำหนดค่าเท่ากับ amount*7
บรรทัดที่ 12 : พิมพ์ค่า cost ออกมา
บรรทัดที่ 14 : ถ้า order เป็น "omelet" ให้ทำบรรทัดที่ 15-16
บรรทัดที่ 15 : สร้างตัวแปรชื่อ cost และกำหนดค่าเท่ากับ amount*10
บรรทัดที่ 16 : พิมพ์ค่า cost ออกมา
บรรทัดที่ 18 : ถ้า order เป็น "egg Benedict" ให้ทำบรรทัดที่ 19-20
บรรทัดที่ 19 : สร้างตัวแปรชื่อ cost และกำหนดค่าเท่ากับ amount*5
บรรทัดที่ 20 : พิมพ์ค่า cost ออกมา
บรรทัดที่ 22-24 : ถ้า order เป็นอื่น ๆ ให้พิมพ์ "Our restaurant has only scrambled eggs, omelettes, and eggs Benedict"
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-30.
Line 4 : Main method is where your program starts running, follow line 5-29.
Line 5 : Scanner for user input.

Line 6 : print "Please insert order: ".
Line 7 : Takes string as an input and assigns it to a variable named order.
Line 8 : print "Please insert amount: ".
Line 9 : Takes integer as an input and assigns it to a variable named amount.

Line 10 : If order is "scrambled egg", follow line 11-12.
Line 11 : Create a variable named cost and set a value equal to amount*7.
Line 12: Print cost.
Line 14 : If order is "omelet", follow line 15-16.
Line 15 : Create a variable named cost and set a value equal to amount*10.
Line 16 : Print cost.
Line 18 : If order is "egg Benedict", follow line 19-20.
Line 19 : Create a variable named cost and set a value equal to amount*5.
Line 20 : Print cost.
Line 22-24 : Else, print "Our restaurant has only scrambled eggs, omelettes, and eggs Benedict".
*/