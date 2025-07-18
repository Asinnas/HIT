public class Main {
    public static void main(String[] args) {

        System.out.println("Bang cuu chuong 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5*i));
        }
        int sf = 0;
        int sw = 0;
        for (int i = 2; i <= 100; i+=2) {
            sf += i;
        }
        int i = 2;
        while ( i <= 100) {
            sw += i;
            i+=2;
        }
        System.out.println("Tong so le tu 1 - 100 bang for: "+ sf);
        System.out.println("Tong so le tu 1 - 100 bang while: "+ sw);
    }
}