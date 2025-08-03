public class Student {
    String name;
    int born;
    String address;
    Double point_1;
    Double point_2;
    Double point_final;
    int rest;

    public void list(){
        int age = 2025 - born;
        double GPA = point_1 * 0.2 + point_2 * 0.3 + point_final * 0.5;
        System.out.printf("Ten: %s | Tuổi: %d | Địa chỉ: %s | TX1: %.2f | TX2: %.2f | KTHP: %.2f | GPA: %.2f | Nghỉ: %d buoi\n",
                name, age, address, point_1, point_2, point_final,GPA, rest);
    }
}

