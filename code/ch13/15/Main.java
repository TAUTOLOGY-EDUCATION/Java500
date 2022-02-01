public class Main {
    static int calculateProfit(int sales, int cogs) {
        return sales - cogs;
    }
    public static void main(String[] args) {
        System.out.println("Gross Profit = " + calculateProfit(5000, 4000));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ calculateProfit ที่รับ parameter เป็น sales และ cogs
บรรทัดที่ 03 : return กำไรขั้นต้นจากการหา sales - cogs

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก calculateProfit(5000, 4000)
*/