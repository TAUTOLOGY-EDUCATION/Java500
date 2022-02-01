public class Main {
    static String repeatWord(String str1, int k) {
        String word = "";
        for (int i = 0; i < k; i++) {
            if (i > 0) {
                word += "-";
            }
            word += str1;
        }
        return word;
    }
    public static void main(String[] args) {
        System.out.println(repeatWord("one", 3));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ repeatWord ที่รับ parameter เป็น str1 และ k
บรรทัดที่ 03 : สร้างตัวแปรชื่อ word และกำหนดค่าเท่ากับ empty string
บรรทัดที่ 04-09 : repeat str1 จำนวน k ครั้ง คั่นด้วย '-' เก็บค่าไว้ใน word
บรรทัดที่ 10 : return word

บรรทัดที่ 12 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 13 : print ค่าที่ได้จาก repeatWord("one", 3)
*/