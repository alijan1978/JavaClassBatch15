package Class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /* Create a program that will be asking user to apply for a credit card 10 times.
            As soon as you get "yes" from a user, program should stop asking
         */
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a Credit card ?");
            String userResponse=scanner.next();

            if(userResponse.equalsIgnoreCase("Yes")){
                break;
            }

        }

    }
}
