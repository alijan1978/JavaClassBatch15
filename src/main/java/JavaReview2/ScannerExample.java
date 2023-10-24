package JavaReview2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int number = 10;

        Scanner scanner = new Scanner(System.in);  // Non-primitive variable => scanner
        System.out.println("Please Enter your age");
        String age1 = scanner.nextLine(); // we should use it at the beginning and it returns the text in return line
        int age = scanner.nextInt(); // to capture int values
        System.out.println("Are you tired ?");
        boolean tired = scanner.nextBoolean(); // to capture boolean values
        System.out.println("What is your name ?");
        String name = scanner.next(); // to capture String until space

        scanner.close(); // better to close it not to take space

    }
}
