import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static double findMean(ArrayList<Integer> arrayA) {
        double sum = 0;
        for (int i: arrayA) {
            sum += i;
        }
        return sum / arrayA.size();
    }

    static double findMedian(ArrayList<Integer> arrayA) {
        Collections.sort(arrayA);   
        if (arrayA.size() % 2 == 1) {
            return arrayA.get(arrayA.size() / 2);
        }
        return (arrayA.get((arrayA.size() - 1) / 2) + arrayA.get(arrayA.size() / 2)) / 2.0;
    }

    static double findMode(ArrayList<Integer> arrayA) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i: arrayA) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            }
            else {
                count.put(i, 1);
            }
        }
        int mode = -1;
        int freq = -1;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > freq) {
                mode = entry.getKey();
                freq = entry.getValue();
            }
        }
        return mode;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 4));
        System.out.println("mean = " + findMean(A));
        System.out.println("median = " + findMedian(A));
        System.out.println("mode = " + findMode(A));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays
บรรทัดที่ 03 : import library ชื่อ Collections
บรรทัดที่ 04 : import library ชื่อ HashMap
บรรทัดที่ 05 : import library ชื่อ Map

บรรทัดที่ 07 : ประกาศ class ชื่อ Main

บรรทัดที่ 08 : ประกาศฟังก์ชันชื่อ findMean ที่รับ parameter เป็น arrayA
บรรทัดที่ 09 : สร้างตัวแปรชื่อ sum และกำหนดให้เป็น 0
บรรทัดที่ 10-12 : หาผลรวมของสมาชิกแต่ละตัวใน arrayA เก็บไว้ใน sum
บรรทัดที่ 13 : หาค่า mean แล้ว return mean ออกมา

บรรทัดที่ 16 : ประกาศฟังก์ชันชื่อ findMedian ที่รับ parameter เป็น arrayA
บรรทัดที่ 17 : เรียงลำดับ arrayA จากน้อยไปมาก
บรรทัดที่ 18-20 : ถ้า arrayA มีจำนวนสมาชิกเป็นเลขคี่ ให้ return สมาชิกตรงกลางของ arrayA ออกมา
บรรทัดที่ 21 : ถ้า arrayA มีจำนวนสมาชิกเป็นเลขคู่ ให้ return ค่าเฉลี่ยของสมาชิก 2 ตัวตรงกลาง

บรรทัดที่ 24 : ประกาศฟังก์ชันชื่อ findMode ที่รับ parameter เป็น arrayA
บรรทัดที่ 25 : สร้างตัวแปรชื่อ count และกำหนดให้เป็น empty map
บรรทัดที่ 26-33 : หาความถี่ของสมาชิกแต่ละตัวใน arrayA เก็บไว้ใน count
บรรทัดที่ 34-41 : หา mode โดยดูจากสมาชิกของ arrayA ที่มีความถี่สูงสุด
บรรทัดที่ 42 : return mode ออกมา

บรรทัดที่ 44 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 45 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {1, 2, 2, 3, 4}
บรรทัดที่ 46 : print ค่า mean
บรรทัดที่ 47 : print ค่า median
บรรทัดที่ 48 : print ค่า mode
*/