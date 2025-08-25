import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> svList = new ArrayList<>();

        svList.add(new SinhVien( "2222", new LopHoc("321", "java"),5.6,"San"));
        svList.add(new SinhVien( "2223", new LopHoc("321", "java"),6.5,"Trung"));
        svList.add(new SinhVien( "2224", new LopHoc("321", "java"),6.6,"Toan"));

        System.out.println();
    }
}