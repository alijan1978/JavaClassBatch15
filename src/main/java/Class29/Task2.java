package Class29;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student type.
        In this Set, we don't care about Insertion Order.
        Each student object should have name and studentID. Display name of each student.
         */
    Set<Student> students = new HashSet<>(); // better to use this for Polymorphism
        students.add(new Student("Khadija", 500123));
        students.add(new Student("Sadeea",  400123));
        students.add(new Student("Abdullah", 870123));
        students.add(new Student("Zainab", 980123));
        students.add(new Student("Tahseen", 000144));

        // display the name of each student
        for(Student stu : students){
            System.out.println("Name: "+stu.getName()+", Student ID: "+ stu.getStudentID());

        }
    }
}
    class Student{
    private String name;
    private int studentID;

        public Student(String name, int studentID) {
            this.name = name;
            this.studentID = studentID;
        }
        public String getName(){
            return name;
        }
        public int getStudentID(){
            return studentID;
        }
    }
