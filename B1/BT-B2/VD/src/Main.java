import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    static final double pi = 3.14159265;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap ban kinh r = ");
        double r = sc.nextDouble();
        System.out.print("Nhap so k = ");
        int k = sc.nextInt();
        System.out.printf("V = %.2f, S = %.2f\n", 2 * pi * r, Math.pow(r, 2) * pi);
        System.out.printf("%.2f mũ %d = %.2f\n", r, k, Math.pow(r, k));
        System.out.printf("Căn (%.2f + %d) = %.2f\n", r, k, Math.sqrt(r + k));
        System.out.printf("| %.2f - %d | = %.2f\n", r, k, Math.abs(r - k));
    }
}