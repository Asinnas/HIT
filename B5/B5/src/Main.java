public class Main {
    public static void main(String[] args) {
        Student studentA = new Student("San", 19, new Address("Phuong Nam Dinh", 14));
        System.out.println(studentA.getName());
        int a = Student.dem;
        System.out.println(Student.dem);
        Student studentB = new Student();
        System.out.println(Student.dem);
        System.out.println(studentA.address.setDiachi());
    }
}