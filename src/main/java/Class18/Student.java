package Class18;

public class Student {
    /*
    Write a Student class that have Instance variables name and address. Create a constructor that will initialize
    those variables. Print name and address of given student using displayInfo method.
     */
    String name;
    String address;
    int ID;
    char grade;

    public Student(String name, String address, int ID, char grade) {
        this.name = name;
        this.address = address;
        this.ID = ID;
        this.grade = grade;
    }
    void displayInfo(){
        System.out.println("Student Name is: "+name+" Student Address is: "+address+
                " Student ID is: "+ID+" and Student grade is: "+grade);
    }

    public static void main(String[] args) {
        Student student=new Student("Sadeea ali"," San Jose, California",5504, 'A');
        student.displayInfo();
    }
}
