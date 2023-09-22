package Class19_1;
import Class19.Teacher;

public class SeleniumTeacher extends Teacher {

    public static void main(String[] args) {

        SeleniumTeacher selenium = new SeleniumTeacher();

        selenium.homework(); // public can be visible in all packages and classes
        selenium.grade(); // Protected , but this time through Inheritance concept using extends keyword
//        selenium.schoarship(); // default
//        selenium.extraPoint(); // private

    }

}
