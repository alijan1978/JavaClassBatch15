package Class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt(); // for Int type, we use nextInt()
        System.out.println("You are "+age+" years old");

    }
}
