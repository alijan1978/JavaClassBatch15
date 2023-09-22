package Class16;

public class Students {
    /*
    Create a Class called Students. create 3 variables Name, ID, and numberOfStudents.
    Create 3 objects f the Student's Class. Set the value of studentName, studentID,
     and increment the numberOfStudents for each object. Print out the total number os students.
     */
    String studentName;
    String studentID;
    static int numberOfStudents; // to share it across all the objects

    public static void main(String[] args) {
        Students students=new Students();
        students.studentName="Khajoo";
        students.studentID="AD123";
        students.numberOfStudents ++;

        Students students1 = new Students();
        students1.studentName="Sadoo";
        students1.studentID="AB4405";
        students1.numberOfStudents ++;

        Students students2=new Students();
        students2.studentName="Diloo";
        students2.studentID="AG8009";
        students2.numberOfStudents ++;

        System.out.println("----student 1 ------\n");
        System.out.println(students.studentName);
        System.out.println(students.studentID);
        System.out.println("----student 2-------\n");
        System.out.println(students1.studentName);
        System.out.println(students1.studentID);
        System.out.println("----student 3 ------\n");
        System.out.println(students2.studentName);
        System.out.println(students2.studentID);

        System.out.println("Total number of Students: "+students.numberOfStudents);


    }
}
