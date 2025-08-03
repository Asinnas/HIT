import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        boolean t = true;
        for (int i = 0; i < str.length() /2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                t = false;
                break;
            }
        }
        if (t) System.out.println(str.toUpperCase() + ": Chuoi nay doi xung");
        else System.out.println(str.toLowerCase() + ": Chuoi nay khong doi xung");
    }
}