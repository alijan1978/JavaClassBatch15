package Class16;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee, Create 3 variables empID, salary, and set the CEO to Sumair.
    Create 2 objects of the class SyntaxEmployee, set the value of empID, salary for each objects.
    print out the empID, salary and CEO for each of the Objects
     */
    String empID;
    double salary;
    static String CEO="Sumair"; // As long as the CEO is the same for all employee, we create Static variable

    public static void main(String[] args) {
        SyntaxEmployee employee= new SyntaxEmployee();
        employee.empID="AC121345";
        employee.salary=1200.10;

        SyntaxEmployee employee1=new SyntaxEmployee();
        employee1.empID="AD44215";
        employee1.salary=1400.50;

        System.out.println(employee.empID);
        System.out.println(employee.salary);
        System.out.println(employee.CEO);
        System.out.println("---Employee 2--------");
        System.out.println(employee1.empID);
        System.out.println(employee1.salary);
        System.out.println(employee1.CEO);

    }
}


