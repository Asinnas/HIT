import java.util.Scanner;

public class School {
    private String name;
    private String date;

    public School(){

    }

    public School(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void Input(Scanner sc) {
        System.out.print(" - Nhập tên trường: ");
        name = sc.nextLine();
        System.out.print(" - Nhập ngày nhập học: ");
        date = sc.nextLine();
    }

    public void Output() {
        System.out.println("Tên trường: " + name);
        System.out.println("Ngày nhập học: " + date);
    }
}
