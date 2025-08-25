public class SinhVien {
    private String svCode;
    private String name;
    private double DTB;
    private LopHoc lopHoc;

    public SinhVien(){

    }

    public SinhVien(String svCode, LopHoc lopHoc, double DTB, String name) {
        this.svCode = svCode;
        this.name = name;
        this.DTB = DTB;
        this.lopHoc = new LopHoc();
    }

    public void inThongTin(){
        System.out.printf("Ten sv: %s | Ma sv: %d | DTB: %.2f ", this.name, this.svCode, this.DTB);
        this.lopHoc.inThongTin();
    }

    public String getSvCode() {
        return svCode;
    }

    public void setSvCode(String svCode) {
        this.svCode = svCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }

    public void setDTB(int DTB) {
        this.DTB = DTB;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }
}
