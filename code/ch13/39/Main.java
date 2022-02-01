import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static ArrayList<String> key, value;
    static void keyAndValue(HashMap<String, String> mapA) {
        key = new ArrayList<String>();
        value = new ArrayList<String>();
        for (Map.Entry<String,String> a : mapA.entrySet()) {
            key.add(a.getKey());
            value.add(a.getValue());
        }
    }
    public static void main(String[] args) {
        HashMap<String, String> A = new HashMap<String, String>();
        A.put("name", "John");
        A.put("sex", "male");
        keyAndValue(A);
        System.out.println(key);
        System.out.println(value);
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ HashMap
บรรทัดที่ 03 : import library ชื่อ Map

บรรทัดที่ 05 : ประกาศ class ชื่อ Main

บรรทัดที่ 06 : สร้างตัวแปรชื่อ key และ value

บรรทัดที่ 07 : ประกาศฟังก์ชันชื่อ keyAndValue ที่รับ parameter เป็น mapA, key และ value
บรรทัดที่ 08 : กำหนดค่าให้ key เท่ากับ empty array
บรรทัดที่ 09 : กำหนดค่าให้ value เท่ากับ empty array
บรรทัดที่ 10 : พิจารณา map แต่ละ element ใน mapA
บรรทัดที่ 11 : นำ key ของ mapA ไปใส่ใน array ชื่อ key
บรรทัดที่ 12 : นำ value ของ mapA ไปใส่ใน array ชื่อ value

บรรทัดที่ 15 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 16-18 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {{"name": "John"}, {"sex": "male"}}
บรรทัดที่ 19 : เรียกใช้ฟังก์ชัน keyAndValue(A, key, value);
บรรทัดที่ 20 : print key
บรรทัดที่ 21 : print value
*/