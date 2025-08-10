public class Student {
    private String name;
    private int age;
    static int dem;
    Address address;

    public Student(){
        dem++;
    }

    public Student(String name, int age, Address){
        this.name = name;
        this.age = age;
        this.address = new Address();
        dem++;
    }

    public Student(String san, int i, Address phuongNamDinh) {
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
