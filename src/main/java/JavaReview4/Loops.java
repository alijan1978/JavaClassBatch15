//package JavaReviewClass4;
//
//import java.util.Scanner;
//
//public class Loops {
//    public static void main(String[] args) {
//
//        //We use while loop, when we don't know how many times to repeat a block of code.
//        // Also we can use do while loop
//        System.out.println("--------------------------------------------------\n");
//
//        int a = 1;
//        while (a <= 3) {
//            System.out.println("I am a while loop");
//            a++;
//        }
//
//        int b = 1;
//        do {
//            System.out.println("it is a do while loop"); // it prints once, don't care about condition
//            b++; // now look if the condition is true, increment or decrement it.
//        } while (b >= 3);
//
//        System.out.println("------------------------------------\n");
//        // Ask students if they understand loops? if they don't get it, ask again
//        // But if they understand loop, you are good and move to array concept next subject
//
//        Scanner scanner = new Scanner(System.in);
//        String answer;
//
//        do {
//            System.out.println("Do you understand loops in Java?");
//            answer = scanner.nextLine();
//
//        } while (!answer.equalsIgnoreCase("Yes")); // it continually loops until the condition gets true (Yes)
//
//            System.out.println("Great job, let's learn Array now");
//
//    }
//}
