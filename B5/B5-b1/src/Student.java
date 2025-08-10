import javax.lang.model.element.Name;
import java.util.Scanner;

public class Student {
    private String name;
    private String lop;
    private double score;
    private Faculty y;

    public Student(){
        y = new Faculty();
    }

    public Student (String name, String lop, double score, Faculty y){
        this.name = name;
        this.lop = lop;
        this.score = score;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void Input(Scanner sc){
        System.out.print("NHập tên sinh viên: ");
        name = sc.nextLine();
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.print("Nhập điểm số: ");
        score = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập thông tin khoa \n");
        y.Input(sc);
    }
    public void Output(){
        System.out.println("Tên sinh viên: " + name);
        System.out.println("Lớp: " + lop);
        System.out.println("Điểm số: " + score);
        y.Output();
    }
}
