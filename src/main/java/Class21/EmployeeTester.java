package Class21;

public class EmployeeTester {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.printSalary();

        OfficeBoy officeBoy = new OfficeBoy();
        officeBoy.printSalary();
    }
    public static void main() { // we can override main method because its static.
        // but if we re-declare it ... its possible and to change its parameter

        Manager manager = new Manager();
        manager.printSalary();

        OfficeBoy officeBoy = new OfficeBoy();
        officeBoy.printSalary();
    }


}
