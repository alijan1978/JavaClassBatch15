package Class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /* Write code to read a range of integers (starting and ending points) provided by a user.
            Then, from that range, print the sum of the even and odd integers.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Start "+start+" end "+end);

        int evenNumberSum = 0; // Declaring variable for Sum
        int oddNumberSum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // to give us Even number
                evenNumberSum += i;
                System.out.println("Even Number "+i);

            }else {
                 oddNumberSum += i;
                System.out.println("Odd Number "+i);
            }
        }
        System.out.println();
        System.out.println("Sum of all the Even Numbers "+evenNumberSum);
        System.out.println("Sum of all the Odd Numbers "+oddNumberSum);

//        System.out.println("-----For Odd Numbers------\n");
//
//        for (int i = start; i <= end; i++) {
//            if (i % 3 != 0) {
//                System.out.println("Odd Number "+i);
//            }
//        }
    }
}
