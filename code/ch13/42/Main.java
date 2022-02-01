public class Main {
    static String switchCase(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
                result += (char)(word.charAt(i) - 'A' + 'a');
            }
            else if ('a' <= word.charAt(i) && word.charAt(i) <= 'z') {
                result += (char)(word.charAt(i) - 'a' + 'A');
            }
            else {
                result += word.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(switchCase("My Name Is John Doe"));
    }
}

/*
บรรทัดที่ 01 : ประกาศ class ชื่อ Main

บรรทัดที่ 02 : ประกาศฟังก์ชันชื่อ switchCase ที่รับ parameter เป็น word
บรรทัดที่ 03 : สร้างตัวแปรชื่อ result และกำหนดให้เป็น empty string
บรรทัดที่ 04 : พิจารณาค่า i ตั้งแต่ 0 ถึง จำนวนอักษรในสตริง - 1
บรรทัดที่ 05-07 : ถ้าอักขระเป็น upper case จะนำ lower case ของอักขระไปใส่ใน result
บรรทัดที่ 08-10 : ถ้าอักขระเป็น lower case จะนำ upper case ของอักขระไปใส่ใน result
บรรทัดที่ 11-13 : ถ้าอักขระ ไม่เป็น ตัวอักษรภาษาอังกฤษ จะนำอักขระไปใส่ใน result
บรรทัดที่ 15 : return result ออกมา

บรรทัดที่ 17 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 18 : print ค่าที่ได้จาก switchCase("My Name Is John Doe")
*/