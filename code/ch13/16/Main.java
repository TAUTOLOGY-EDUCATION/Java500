public class Main {
    static double sale(int price, int discount) {
        return price * (100.0 - discount) / 100;
    }
    public static void main(String[] args) {
        System.out.println("Discounted Price = " + sale(1000, 20));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ sale ที่รับ parameter เป็น price และ discount
บรรทัดที่ 03 : return ราคาหลังหักส่วนลดแล้ว

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก sale(1000, 20)
*/