package Class6;

import java.util.Scanner;

public class LogicalORoperator {
    public static void main(String[] args) {

        // We can use it with Scanner at the end.. to practice
//        System.out.println("Please enter the day of week");
//        Scanner scan = new Scanner(System.in);
//        String day=scan.next();

        String day = "Tuesday";

        if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
            System.out.println("No class today , Enjoy");
        }else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            System.out.println("Its Java class today");
        }else if(day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual Testing class");
        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Today is Review class");
        }else {
            System.out.println("Wrong day of the Week entered");
        }



    }
}
