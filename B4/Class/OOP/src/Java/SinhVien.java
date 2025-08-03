package Java;

public class SinhVien {
    public String maSinhVien ;
    public String name ;
    public int age ;
    int diem ;

    public SinhVien(String maSinhVien, String name, int age, int diem){
        this.maSinhVien = maSinhVien;
        this.name = name;
        this.age = age;
        this.diem = diem;
    }

    public SinhVien() {

    }

    public String getMaSinhVien(){
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien){
        this.maSinhVien = maSinhVien;
    }
}

