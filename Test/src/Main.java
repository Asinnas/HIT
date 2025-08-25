import java.util.Scanner;

public class Main {
    public void test(String s){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int d = 0;
        boolean f = true;
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            int c = 0;
            if (Character.isLetter(t)) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == t) {
                        c++;
                    }
                }
            }
            if (c > 1) {
                f = false;
                break;
            }
        }
        System.out.println(f);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                d++;
            }
        }
        System.out.println("So khoan trang la: " + d);
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

    }
}


