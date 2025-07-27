import java.util.Scanner;

public class Main {
    static final String square = "Square";
    static final String triangle = "Triangle";
    static final String circle = "Circle";
    public static Scanner sc = new Scanner(System.in);
    public static void tsquare(Scanner sc){
        System.out.print("Nhap canh hinh vuong: ");
        double a = sc.nextDouble();
        System.out.printf("Dien tich hinh vuong la: %.2f\n", (a*a));
    }
    public static void ttriangle(Scanner sc){
        System.out.print("Nhap day hinh tam giac: ");
        double b = sc.nextDouble();
        System.out.print("Nhap chieu cao hinh tam giac: ");
        double h = sc.nextDouble();
        System.out.printf("Dien tich hinh tam giac la: %.2f\n", (0.5 * b * h));
    }
    public static void tcircle(Scanner sc){
        System.out.print("Nhap ban kinh hinh tron: ");
        double r = sc.nextDouble();

        System.out.printf("Dien tich hinh tron la: %.2f\n", (r*r*3.1415));
    }
    public static void main(String[] args){
        System.out.print("Nhap hinh dang: ");
        String type = sc.nextLine();
        if (type.equalsIgnoreCase(square)){
            tsquare(sc);
        }else if (type.equalsIgnoreCase(triangle)){
            ttriangle(sc);
        }else if (type.equalsIgnoreCase(circle)){
            tcircle(sc);
        }else{
            System.out.println("Hinh dang khong hop le");
        }
    }
}