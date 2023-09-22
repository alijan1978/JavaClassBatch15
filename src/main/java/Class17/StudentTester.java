package Class17;

public class StudentTester {
    public static void main(String[] args) {

        Student student = new Student("Khadija", "AB1236",17, 130.5);
        Student student1 = new Student("Sadeea", "AD4005", 16, 135.0);
        Student student2 = new Student("Abdullah","AC56002",13, 104.0);

        System.out.println(student.name);
        System.out.println(student.id);
        System.out.println(student.age);
        System.out.println(student.weight);
    }
}
