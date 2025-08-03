import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] a = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            // Trái → Phải
            for (int i = left; i <= right; i++) {
                a[top][i] = value++;
            }
            top++;

            // Trên ↓ Dưới
            for (int i = top; i <= bottom; i++) {
                a[i][right] = value++;
            }
            right--;

            // Phải → Trái
            for (int i = right; i >= left; i--) {
                a[bottom][i] = value++;
            }
            bottom--;

            // Dưới ↑ Trên
            for (int i = bottom; i >= top; i--) {
                a[i][left] = value++;
            }
            left++;
        }

        // In ma trận
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
