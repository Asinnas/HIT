public class Nv {
    private String nvCode;
    private String nvname;
    private int age;
    private int sdt;
    private String email;

    public Nv(){

    }

    public Nv(String nvCode, String nvname, int age, int sdt, String email) {
        this.nvCode = nvCode;
        this.nvname = nvname;
        this.age = age;
        this.sdt = sdt;
        this.email = email;
    }

    public double LinhLuong(){
        return 0;
    }

    @Override
    public String toString() {
        return "Nv{" +
                "nvCode='" + nvCode + '\'' +
                ", nvname='" + nvname + '\'' +
                ", age=" + age +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                '}';
    }

    public void hienThiThongTin(){

    }

    public String getNvCode() {
        return nvCode;
    }

    public void setNvCode(String nvCode) {
        this.nvCode = nvCode;
    }

    public String getNvname() {
        return nvname;
    }

    public void setNvname(String nvname) {
        this.nvname = nvname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
