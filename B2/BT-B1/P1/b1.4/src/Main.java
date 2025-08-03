import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mang: ");
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }
        System.out.print("Mang da nhap la: ");
        int max = a[0];
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
            s+=a[i];
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("\nTong cac phan tu trong mang: " + s);
        System.out.println("Phan tu lon nhat: " + max);
    }
}