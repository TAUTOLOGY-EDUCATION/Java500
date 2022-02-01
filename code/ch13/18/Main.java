import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Integer> findIndex(ArrayList<Integer> arrayA, int k) {
        ArrayList<Integer> indexArray = new ArrayList<Integer>();
        for (int i = 0; i < arrayA.size(); i++) {
            if(arrayA.get(i) == k) {
                indexArray.add(i);
            }
        }
        if (indexArray.size() == 0) {
            indexArray.add(-1);
        }
        return indexArray;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 12));
        System.out.println(findIndex(A, 4));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ findIndex ที่รับ parameter เป็น arrayA และ k
บรรทัดที่ 06 : สร้างตัวแปรชื่อ indexArray และกำหนดให้เป็น empty array
บรรทัดที่ 07-11 : พิจารณาค่า i ตั้งแต่ 0 ถึง n-1 ถ้าสมาชิกตำแหน่งที่ i ของ arrayA มีค่าเท่ากับ k ให้นำ i ไปใส่ใน indexArray
บรรทัดที่ 12-14 : ถ้า indexArray เป็น empty array ให้นำ -1 ใส่ใน indexArray
บรรทัดที่ 15 : return indexArray ออกมา

บรรทัดที่ 18 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 19 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {2, 4, 6, 8, 12}
บรรทัดที่ 20 : print ค่าที่ได้จาก findIndex(A, 4)
*/