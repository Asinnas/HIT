public class Student extends Person{
    private int studentCode;
    private String school;

    public Student(int studentCode, String school) {
        this.studentCode = studentCode;
        this.school = school;
    }

    public Student(String name, int age, int studentCode, String school) {
        super(name, age);
        this.studentCode = studentCode;
        this.school = school;
    }

    public void graduate(boolean isGraduate){
        if (isGraduate){
            System.out.println("Da tot nghiep");
        }else System.out.println("Chua tot nghiep");
    }

    @Override
    public void eat(){
        System.out.println("Toi dang uống");
    }

    @Override
    public void active() {
        System.out.println("Toi dang thuc");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }
}
