package Class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        // with the help of Scanner built-in class, we take the input from the keyboard
        // and print it inside the Console, we need two lines of code
        // Scanner class should be imported from Java.util
        // Below line Helps us get the input from the Keyboard, write what is asked and hit/press Enter
        // the method .next() you just type in console
        // the method .nextLine() you type in console and it saves in variable and print it back
        // OR nextLine() is used when we have to take sentences/input from the keyboard

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");

        String name=input.nextLine(); // for the String type, we use nextLine()
        System.out.println("My name is "+ name);
    }
}
