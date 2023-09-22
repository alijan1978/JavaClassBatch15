package Class3part2;

public class VariablesDemo_1 {
    public static void main(String[] args) {

        int age=10; // Creating a box of type "int" nad store the value of "10" in it
        int salary; // ONLY created a box of type "int" and didn't assign any value to it. we can do it later
        salary=120000; // simply accessed the variable, updating the variable for reassigning the value
        System.out.println(salary);

        /*
        String name;
        String city;
        String country;
         */

        String name, city, country; // we can create multiple empty variables of the same datatype in a single line.
        char gender, letter;
        name="Tahseen jan";
        //System.out.println(city); ... Here I have not stored anything inside the city variable to print
        System.out.println(name); // I already stored the value in the name variable

    }
}
