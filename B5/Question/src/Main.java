import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Cage cage1 = new Cage("1");
        Cage cage2 = new Cage("2");

        cage1.addPet(new Pet("Mèo Mun", "Cat", 4.5));
        cage1.addPet(new Pet("Cún Vàng", "Dog", 12.0));
        cage1.addPet(new Pet("Mèo Anh", "Cat", 8.0));

        cage2.addPet(new Pet("Cún Đen", "Dog", 15.0));
        cage2.addPet(new Pet("Mèo Trắng", "Cat", 9.5));

        System.out.println("\nSố lồng đã tạo: " + Cage.totalCages);

        System.out.println("\nDanh sách thú trong từng lồng:");
        System.out.print("           --== Lồng 1 ==--");
        cage1.printAllPet();
        System.out.print("           --== Lồng 2 ==--");
        cage2.printAllPet();

        System.out.println("\nDanh sách thú nặng hơn 10kg:");
        for (Cage cage : new Cage[]{cage1, cage2}) {
            for (Pet pet : cage.petList) {
                if (pet.isOverweight()) {
                    System.out.println(pet.getBasicInfo() + " - " + pet.getWeight() + "kg");
                }
            }
        }
    }
}