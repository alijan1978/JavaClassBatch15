package Class22;

public class StudentTester {
    public static void main(String[] args) {

        Student [] students = {new CollegeStudent(),new SyntaxStudent(),new SchoolStudent()};

        for(Student goodStudent : students){
            goodStudent.doHomeWork();
            goodStudent.practice();
            goodStudent.study();
        }

    }
}
