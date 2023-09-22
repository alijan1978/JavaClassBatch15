package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArray2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        //Now we use Scanner to give value for our desired index

        int[] numbers = new int[5];
        // Below codes takes the numbers from user input and store them in the array ...

        numbers[1]= scan.nextInt();
        numbers[0]= scan.nextInt();
        numbers[4]= scan.nextInt();
        numbers[3]= scan.nextInt();
        numbers[2]= scan.nextInt();

        System.out.println(Arrays.toString(numbers)); // 1. Printing without writing Loop

    }
}
