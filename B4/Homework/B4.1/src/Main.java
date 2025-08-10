import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean t = true;
        Student[] a = new Student[5];
        while (t) {
            System.out.println("\n1: Nhập sinh viên");
            System.out.println("2: Chọn sinh viên");
            System.out.println("3: Thoát chu trình");
            System.out.print("\nBạn chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon){
                case 1:
                    for (int i = 0; i < 5; i++) {
                        a[i] = new Student();
                        System.out.println("\nSinh viên số " + (i+1));

                        System.out.print("\nNhập tên: ");
                        a[i].name = sc.nextLine();

                        System.out.print("Nhập năm sinh: ");
                        a[i].born = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nhập địa chỉ: ");
                        a[i].address = sc.nextLine();

                        System.out.print("Nhập điểm TX1: ");
                        a[i].point_1 = sc.nextDouble();

                        System.out.print("Nhập điểm TX2: ");
                        a[i].point_2 = sc.nextDouble();

                        System.out.print("Nhập điểm KTHP: ");
                        a[i].point_final = sc.nextDouble();

                        System.out.print("Nhập số tiết nghỉ: ");
                        a[i].rest = sc.nextInt();
                        sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.print("Sinh viên số: ");
                    int s = sc.nextInt();
                    if (s >= 1 && s <= 5 && a[s - 1] != null){
                        a[s - 1].list();
                    } else System.out.print("Không có sinh viên này");
                    break;
                case 3:
                    t = false;
                    break;
            }
        }
    }
}