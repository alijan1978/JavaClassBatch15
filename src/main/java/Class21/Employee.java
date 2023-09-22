package Class21;

public class Employee {

    String name;
    static int baseSalary=30000;
    static int baseHolidays = 10;

    void printSalary(){
        System.out.println("Base Salary is: "+baseSalary);
    }
    void printHolidays(){
        System.out.println("Base Holidays are "+baseHolidays);
    }
}

    class OfficeBoy extends Employee{
}

    class Manager extends Employee{

    void printSalary(){
        System.out.println("Manager salary "+(baseSalary*4)+20000); // we override printSalary method... implementation can be changed
    }
}
    class Developer extends Employee{

    void printSalary(){
        System.out.println(("Developer salary "+baseSalary*4)+30000);
    }
}
    class QA extends Employee{

        void printSalary(){
            System.out.println(("QA salary "+baseSalary*2)+30000);
        }

        void printHolidays(){
        System.out.println("QA holidays "+baseHolidays+5);
    }
    }