import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    static HashMap<Integer, Integer> coinChanger(int amount) {
        ArrayList<Integer> coinArray = new ArrayList<Integer>(Arrays.asList(10, 5, 2, 1));
        HashMap<Integer, Integer> coinDict = new HashMap<Integer, Integer>();
        for (int c: coinArray) {
            coinDict.put(c, amount / c);
            amount = amount - coinDict.get(c) * c;
        }
        return coinDict;
    }
    public static void main(String[] args) {
        System.out.println(coinChanger(58));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays
บรรทัดที่ 03 : import library ชื่อ HashMap

บรรทัดที่ 05 : ประกาศ class ชื่อ Main

บรรทัดที่ 06 : ประกาศฟังก์ชันชื่อ coinChanger ที่รับ parameter เป็น amount
บรรทัดที่ 07 : สร้างตัวแปรชื่อ coinArray และกำหนดให้เป็น {10, 5, 2, 1}
บรรทัดที่ 08 : สร้างตัวแปรชื่อ coinDict และกำหนดให้เป็น empty map
บรรทัดที่ 09-12 : คำนวณจำนวนเหรียญที่ต้องใช้สำหรับแลกเหรียญ c นำจำนวนเหรียญไปเก็บใน coin_dict จากนั้นนำมูลค่าที่แลกเหรียญ c ไปหักลบกับ amount
บรรทัดที่ 13 : return coinDict ออกมา

บรรทัดที่ 15 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 16 : print ค่าที่ได้จาก coinChanger(58)
*/