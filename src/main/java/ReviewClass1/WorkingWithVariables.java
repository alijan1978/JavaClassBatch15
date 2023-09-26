package ReviewClass1;

public class WorkingWithVariables {
    public static void main(String[] args) {

        // Create a variable and store value int it
        // OR we can say: Declare a variable and initialize it

        int number = 10; // declared variable and initialized
        int num; // just declared a variable, but happens only once
        num = 100; // another way to initialize the variable
        num = 200; // Reassign the value
        System.out.println(num); // print 200

        boolean hungry=false;
        hungry=true;

        // String is the most popular datatype
        String myString = "Hello";
        String name = "Sadeea";
        String address = "123 Test Drive";
        System.out.println(myString+" "+name);// print Hello Sadeea from myString variable and name
        // We concatinate (concat) the two variable with + plus sign ... also adding space " "

        int age=16;
        System.out.println(name+" is "+age+" years old");
        /*
        We can attach String to anything, like:
        String to another String
        String to int
        String to boolean
        String to char
        WE just use + sign (to concat)
         */

        System.out.println(number + num); // here we have 2 Numeric value and + sign add them together

        String n1 = "10";
        System.out.println(n1 + num);// here num value will concatenate with a String 10

        String month ="December";
        int day = 14;
        System.out.println(day + " "+month);

        char date ='1'; // number 1 is 49 based on ASCII table
        System.out.println(date+" "+month);

        System.out.println(date + day);// prints out 63, Why?
        // with the help of ASCII table, Every character or number has a specific number behind the scene in ASCII table

    }
}
