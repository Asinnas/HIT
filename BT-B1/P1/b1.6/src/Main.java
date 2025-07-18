import  java.util.Scanner;

class Student {
    String name;
    int age;
    double gpa;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nNhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ten: ");
            students[i].name = sc.nextLine();
            System.out.print("Tuoi: ");
            students[i].age = sc.nextInt();
            System.out.print("GPA: ");
            students[i].gpa = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("\nDanh sach sinh vien");
        for (int i = 0; i < n; i++){
            System.out.println("Ten: " + students[i].name + ", Tuoi: " + students[i].age + ", GPA: " + students[i].gpa);
        }
        double s = 0;
        for (int i = 0; i < n; i++){
            s+= students[i].gpa;
        }
        System.out.println("Diem trung binh ca lop: " + (s/n));
        Student max = students[0];
        for (int i = 0; i < n; i++){
            if (max.gpa < students[i].gpa){
                max = students[i];
            }
        }
        System.out.print("Sinh vien co diem cao nhat la: ");
        System.out.println( max.name + ", Tuoi: " + max.age + ", GPA: " +max.gpa);


    }
}