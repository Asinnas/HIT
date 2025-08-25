public class LopHoc {
    private String classCode;
    private String className;

    public LopHoc(){

    }

    public LopHoc(String clasCode, String className) {
        this.classCode = clasCode;
        this.className = className;
    }

    public void inThongTin(){
        System.out.printf("Ten lop: %s | Ma lop: %d",this.className, this.classCode);
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
