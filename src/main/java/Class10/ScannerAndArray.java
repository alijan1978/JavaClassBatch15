package Class10;

import java.util.Arrays;

public class ScannerAndArray {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        //Below codes are manually stored numbers in the array
        numbers[1]= 10;
        numbers[0]= 20;
        numbers[4]= 30;
        numbers[3]= 40;
        numbers[2]= 50;

        System.out.println(Arrays.toString(numbers)); // Printing without writing Loop
    }
}
