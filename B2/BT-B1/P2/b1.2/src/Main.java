import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n+1];
        System.out.print("Nhap mang: ");
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i+=2) {
            if (i == n && i % 2 == 0){
                break;
            }if (i == n && i % 2 != 0){
                a[i] = 0;
            }
            a[i] += Math.abs(a[i-1] - a[i+1]);
        }
        for (int i = 0; i < n ; i++) {
            System.out.print(a[i] + " ");
        }
    }
}