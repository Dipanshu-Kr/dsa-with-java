public class CopyConstructorDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Dipanshu";
        s1.roll = 2419851;

        Student s2 = new Student(s1);

        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Student {
    String name;
    int roll;

    Student() {}

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}
