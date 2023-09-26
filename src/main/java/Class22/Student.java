package Class22;

public class Student {
    /*
    Create a Class of Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some methods in child classes.
    Define some methods specific to child classes and write example of achieving run time Polymorphism
     */
    public void study(){
        System.out.println("Studying ....");
    }
    public void doHomeWork(){
        System.out.println("Solving homeworks");
    }
    public void practice(){
        System.out.println("practicing the skills");
    }
}

    class SyntaxStudent extends Student{

        @Override
        public void study() {
            System.out.println("Syntax student must study Java programming");}

        @Override
        public void doHomeWork() {
            System.out.println("SynTax student must solve the homework before next class");}

        @Override
        public void practice() {
            System.out.println("Syntax student must practice Repils");        }
    }

    class CollegeStudent extends Student{

        @Override
        public void practice() {
            System.out.println("College students must practice to get Good Grades");        }
    }

    class SchoolStudent extends Student{

    }
