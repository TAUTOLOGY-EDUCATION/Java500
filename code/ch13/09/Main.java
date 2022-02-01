public class Main {
    static String concatThreeString(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }
    public static void main(String[] args) {
        System.out.println(concatThreeString("A", "ma", "zon"));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ concatThreeString ที่รับ parameter เป็น str1, str2 และ str3
บรรทัดที่ 03 : return ผลบวกของ str1, str2 และ str3 (การบวกกันของ string คือการนำมาต่อกัน)

บรรทัดที่ 05 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 06 : print ค่าที่ได้จาก concatThreeString("A", "ma", "zon")
*/