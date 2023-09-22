package Class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        Scanner: Name of the class
        scan: is a variable like we create primitive variables
        = : is assignment operator
        System.in: tells the computer that we want to read the data from keyboard in our Console
         */

        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Your weight is "+weight+" lbs");

        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0); // .charAt(0) is just for char datatype... Using 0 means take first letter
        System.out.println("Your gender is "+gender);

        System.out.println("Please enter your fist name");
        String name=scan.next(); // .next() just print the first name if it has space
        // , BUT .nextLine() will print the full lines
        System.out.println("My name is "+name);

        scan.nextLine(); // use this trick to make nextLine method work better after we used any other method
        // scanner class in our previous lines
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine(); // .nextLine is capable of print the more new lines... But not recommended
        System.out.println("Your full name is "+fullName);

        scan.close(); // since scanner is expensive resource and takes a lot of memory... better to close is
        // so if it is open, it slow down your computer especially keyboard process


        }
}
