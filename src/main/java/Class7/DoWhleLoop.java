package Class7;

import java.util.Scanner;

public class DoWhleLoop {
    public static void main(String[] args) {

        // Do WhilLoop at least print the code once even the condition is Not True
        // with Do whileLoop, the code is more readable

        Scanner scan = new Scanner(System.in);
//        int number = 0; its the same you assign value or not
        int number;
        do {
            System.out.println("Please enter a number");
            number = scan.nextInt();
        }while (number != 5 );

        System.out.println("--------With While Loop--------------\n");
    // using the same above logic with While Loop as below:

        int number2 = 5;
        while (number2 != 5){
            System.out.println("Please enter a number");
            number2 = scan.nextInt();
        }

    }
}
