import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert traffic status: ");
        String status = sc.nextLine(); 
        System.out.print("Please insert distance(km): ");
        double distance = sc.nextDouble(); 
        if (status.equals("flow")) {
            double cost = distance * 10;
            System.out.print(cost);
        }
        else if (status.equals("normal")) {
            double cost = distance * 12;
            System.out.print(cost);
        }
        else if (status.equals("dense")) {
            double cost = distance * 15;
            System.out.print(cost);
        }
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ Scanner

บรรทัดที่ 03 : ประกาศ class ชื่อ Main

บรรทัดที่ 04 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 05 : ประกาศตัวแปรชื่อ sc สำหรับรับ input จากผู้ใช้ 

บรรทัดที่ 06 : พิมพ์ "Please insert traffic status: "
บรรทัดที่ 07 : รับอินพุตที่เป็นสายอักขระและกำหนดค่าใส่ตัวแปรชื่อ status
บรรทัดที่ 08 : พิมพ์ "Please insert traffic distance: "
บรรทัดที่ 09 : รับอินพุตที่เป็นจำนวนจริงและกำหนดค่าใส่ตัวแปรชื่อ distance

บรรทัดที่ 10 : ถ้า status เป็น "flow" ให้ทำบรรทัดที่ 11-13
บรรทัดที่ 11-13 : สร้างตัวแปรชื่อ cost เพื่อคำนวณค่าเดินทางตามที่โจทย์กำหนด พิมพ์ค่า cost ออกมา
บรรทัดที่ 14 : ถ้า status เป็น "normal" ให้ทำบรรทัดที่ 15-16
บรรทัดที่ 15-16 : สร้างตัวแปรชื่อ cost เพื่อคำนวณค่าเดินทางตามที่โจทย์กำหนด พิมพ์ค่า cost ออกมา
บรรทัดที่ 18 : ถ้า status เป็น "dense" ให้ทำบรรทัดที่ 19-20
บรรทัดที่ 19-20 : สร้างตัวแปรชื่อ cost เพื่อคำนวณค่าเดินทางตามที่โจทย์กำหนด พิมพ์ค่า cost ออกมา
*/

/*
Line 1 : Import Scanner class for user input.
Line 3 : Main class, everything goes in a class, follow line 4-22.
Line 4 : Main method is where your program starts running, follow line 5-21.
Line 5 : Scanner for user input.

Line 6 : print "Please insert traffic status: ".
Line 7 : Takes string as an input and assigns it to a variable named status.
Line 8 : print "Please insert distance(km): ".
Line 9 : Takes double as an input and assigns it to a variable named distance.

Line 10 : If status is "flow", follow line 11-12.
Line 11-12 : Create a variable named cost to calculate the travel cost, then print the value of cost.
Line 14 : If status is "normal", follow line 15-16.
Line 15-16 : Create a variable named cost to calculate the travel cost, then print the value of cost.
Line 18 : If status is "dense", follow line 19-20.
Line 19-20 : Create a variable named cost to calculate the travel cost, then print the value of cost.
*/