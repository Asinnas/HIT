import Java.SinhVien;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student sinhVienA = new Student();
        sinhVienA.maSinhvien = "2024607141";
        sinhVienA.name = "Nguyen Vinh San";
        sinhVienA.age = 19;
        System.out.println(sinhVienA.maSinhvien);
        System.out.println(sinhVienA.name);
        System.out.println(sinhVienA.age);

        SinhVien a = new SinhVien();
        a.name = "San";
        a.maSinhVien = "2024607141";
        a.age = 19;
    }
}