package Class19;

public class School {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.teacherName="Barbara";
        teacher.teacherID="T0021";

        System.out.println("This is Principal "+teacher.teacherName);
//        teacher.extraPoint();// cannot be visible because its private modifier

        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.teacherName="Luna";
        mathTeacher.teacherID="M44001";
        mathTeacher.subject="Math";
        System.out.println("Teacher "+mathTeacher.teacherName+" teach "+mathTeacher.subject);
        mathTeacher.excellent(); // comes from Child class
        mathTeacher.homework(); // comes from Parent class



    }
}
