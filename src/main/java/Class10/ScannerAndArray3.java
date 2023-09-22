package Class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArray3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        int[] numbers = new int[5];
       // Below codes are manually stored numbers in the array
        numbers[1]= 10;
        numbers[0]= 20;
        numbers[4]= 30;
        numbers[3]= 40;
        numbers[2]= 50;

        // below codes uses normal for loop to ask the user for numbers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
