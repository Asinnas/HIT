import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] list = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i+1) + ": " );
            list[i] = new Student();
            list[i].Input(sc);
        }
        System.out.println("*************************");
        System.out.println("Danh sách sinh viên");
        for (Student sv : list) {
            sv.Output();
            System.out.println("*************************");
        }
    }
}