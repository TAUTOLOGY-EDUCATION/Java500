import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static double distanceRn(ArrayList<Double> P1, ArrayList<Double> P2) {
        double sumSquare = 0;
        for (int i = 0; i < P1.size(); i++) {
            sumSquare += Math.pow(P1.get(i) - P2.get(i), 2);
        }
        double distance = Math.sqrt(sumSquare);
        return distance;
    }
    public static void main(String[] args) {
        ArrayList<Double> A = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 2.0, 1.0));
        ArrayList<Double> B = new ArrayList<Double>(Arrays.asList(3.0, 4.0, 0.0, -1.0));
        System.out.println(distanceRn(A, B));
    }
}

/*
บรรทัดที่ 01 : import library ชื่อ ArrayList
บรรทัดที่ 02 : import library ชื่อ Arrays

บรรทัดที่ 04 : ประกาศ class ชื่อ Main

บรรทัดที่ 05 : ประกาศฟังก์ชันชื่อ distanceRn ที่รับ parameter เป็น P1 และ P2
บรรทัดที่ 06 : สร้างตัวแปรชื่อ sumSquare และกำหนดค่าเท่ากับ 0
บรรทัดที่ 07-09 : พิจารณาค่า i ตั้งแต่ 0 ถึง P1.size()-1 นำผลต่างของ P1 และ P2 ในตำแหน่งทื่ i ไปยกกำลังสองแล้ว นำไปบวกเพิ่มที่ sumSquare
บรรทัดที่ 10 : สร้างตัวแปรชื่อ distance สำหรับหาระยะห่าง ซึ่งคำนวณได้ตามสูตรข้างต้น
บรรทัดที่ 11 : return distance ออกมา

บรรทัดที่ 13 : ฟังก์ชัน main โปรแกรมจะเริ่มรันฟังก์ชันนี้เป็นฟังก์ชันแรก
บรรทัดที่ 14 : สร้างตัวแปรชื่อ A และกำหนดให้เป็น {1, 2, 2, 1}
บรรทัดที่ 15 : สร้างตัวแปรชื่อ B และกำหนดให้เป็น {3, 4, 0, -1}
บรรทัดที่ 16 : print ค่าที่ได้จาก distanceRn(A, B)
*/