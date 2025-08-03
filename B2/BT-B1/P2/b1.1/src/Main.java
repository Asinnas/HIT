import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        double r = sc.nextDouble();
        double pi = 3.14;
        System.out.printf("%.3f %.3f\n", (2 * pi * r), (r * r * pi));
    }
}