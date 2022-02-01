public class Main {
    static String delWord(String str1, String str2) {
        return str1.replace(str2, "");
    }
    public static void main(String[] args) {
        System.out.println(delWord("onetwothree", "two"));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ delWord ที่รับ parameter เป็น str1 และ str2
บรรทัดที่ 03 : return str1 ที่ถูกแทนที่ str2 ด้วย empty string

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก delWord("onetwothree", "two")
*/