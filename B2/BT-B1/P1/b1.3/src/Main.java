import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu 1: ");
        double a = sc.nextInt();
        System.out.print("Nhap so thu 2: ");
        double b = sc.nextInt();
        System.out.println("Tong " + a + " + " + b +  " = " + (a+b));
        System.out.println("Hieu " + a + " - " + b +  " = " + (a-b));
        System.out.println("Tich " + a + " * " + b +  " = " + (a*b));
        System.out.println("Thuong " + a + " / " + b +  " = " + (a/b) +  " va so du la " + (a%b));
        if (a == b) {
            System.out.println("Hai so bang nhau");
        }else {
            System.out.println("Hai so khac nhau");
        }
    }
}