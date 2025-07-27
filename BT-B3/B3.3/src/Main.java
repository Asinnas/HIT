import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int testMath(int a, int b, int c){
        if (a + b == c) return 0;
        else return 1;
    }
    public static int testStr(String anwer){
        if (anwer.equalsIgnoreCase("correct")) return 0;
        else if (anwer.equalsIgnoreCase("incorrect")) return 1;
        return 0;
    }
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 200);
        boolean n = Math.random() < 0.5;
        if (n) c = a + b;
        System.out.printf("%d + %d = %d",a,b,c);
        System.out.println("\n----Correct / Incorrect----");
        String anwer = sc.nextLine();
        if (testMath(a,b,c) == testStr(anwer)) System.out.println("Ban tra loi dung");
        else if (testMath(a,b,c) != testStr(anwer)) System.out.println("Ban tra loi sai");
    }
}