import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School x;

    public Faculty(){
        x = new School();
    }

    public Faculty(String name, String data, School x){
        this.name = name;
        this.date = data;
        this.x = x;
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

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public void Input(Scanner sc) {
        System.out.print(" - Nhập tên khoa: ");
        name = sc.nextLine();
        System.out.print(" - Nhập ngày vào khoa: ");
        date = sc.nextLine();
        System.out.println("Nhập thông tin trường");
        x.Input(sc);
    }

    public void Output() {
        System.out.println("Tên khoa: " + name);
        System.out.println("Ngày nhập học: " + date);
        x.Output();
    }
}
