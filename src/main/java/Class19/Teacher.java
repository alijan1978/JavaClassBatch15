package Class19;

public class Teacher {

    String teacherName;
    String teacherID;

    public void homework(){
        System.out.println("Homeworks make students perfect ");
    }
    protected void grade(){
        System.out.println("Grade doesn't matter");
    }
   void scholarship(){
        System.out.println("Good students from this class will get scholarship");
    }
    private void extraPoint(){
        System.out.println("All students attend the class will get extra point");
    }
}

    class MathTeacher extends Teacher{

    String subject;
    String grade;

    void excellent(){
        System.out.println("This math class is excellent");
    }
}

    class ChemistryTeacher extends Teacher{

    String homework;
    String test;

    void science(){
        System.out.println("Chemistry class is not fun");
    }

    }
