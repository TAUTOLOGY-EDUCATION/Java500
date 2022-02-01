public class Main {
    static String concatTwoString(String str1, String str2) {
        return str1 + str2;
    }
    public static void main(String[] args) {
        System.out.println(concatTwoString("Goo", "gle"));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ concatTwoString ที่รับ parameter เป็น str1 และ str2
บรรทัดที่ 03 : return ผลบวกของ str1 และ str2 (การบวกกันของ string คือ การนำมาต่อกัน)

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก concatTwoString("Goo", "gle")
*/