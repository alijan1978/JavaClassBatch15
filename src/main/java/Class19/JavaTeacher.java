package Class19;

public class JavaTeacher extends Teacher {

    void code(){
        System.out.println("Java teacher teaches how to practice coding");
    }

    public static void main(String[] args) {
        JavaTeacher java=new JavaTeacher();
        java.teacherName = "Asel";
        java.teacherID = "T878";

        java.homework();
        java.grade();
        java.scholarship();
//      java.extraPoint(); // cannot access (variable & methods) private access modifier in another class


    }
}
