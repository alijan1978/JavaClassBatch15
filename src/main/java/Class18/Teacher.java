package Class18;

public class Teacher {

    String name;
    int teacherID;
    String subject;

    public Teacher(String name, int teacherID) {
        this.name = name;
        this.teacherID = teacherID;
    }

    public Teacher(String name, int teacherID, String subject) {
        this.name = name;
        this.teacherID = teacherID;
        this.subject = subject;
    }

    public static void main(String[] args) {
        Teacher teacher=new Teacher("John", 1234);

        Teacher teacher1=new Teacher("James", 4005,"English");
        System.out.println("-------- End of the code ---------------");
    }


}
