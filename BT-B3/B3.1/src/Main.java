import java.util.Scanner;

public class Main {
    static final String square = "Square";
    static final String triangle = "Triangle";
    static final String circle = "Circle";
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Nhap hinh dang: ");
        String type = sc.nextLine();
        double s;
        if (type.equalsIgnoreCase(square)){
            System.out.print("Nhap canh hinh vuong: ");
            double a = sc.nextDouble();
            s = a * a;
            System.out.printf("Dien tich hinh vuong la: %.2f\n", s);
        }else if (type.equalsIgnoreCase(triangle)){
            System.out.print("Nhap day hinh tam giac: ");
            double b = sc.nextDouble();
            System.out.print("Nhap chieu cao hinh tam giac: ");
            double h = sc.nextDouble();
            s = 0.5 * b * h;
            System.out.printf("Dien tich hinh tam giac la: %.2f\n", s);
        }else if (type.equalsIgnoreCase(circle)){
            System.out.print("Nhap ban kinh hinh tron: ");
            double r = sc.nextDouble();
            s = r*r*3.1415;
            System.out.printf("Dien tich hinh tron la: %.2f\n", s);
        }else{
            System.out.println("Hinh dang khong hop le");
        }
    }
}