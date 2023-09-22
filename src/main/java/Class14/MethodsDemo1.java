package Class14;

import java.util.Arrays;

public class MethodsDemo1 {
    public static void main(String[] args) {

     int [] array = {10,20,30,40,50};

     // how to add all numbers Manually and print it

        int sum = 0;
        for(int number: array){
            sum += number;
        }
        System.out.println(Arrays.toString(array)); // show up all numbers
        System.out.println("The sum of all numbers are:  "+sum);

        System.out.println("---------We have another Array of numbers to add manually --------\n");

        int [] array2 = {34,24,35,47,58};

        int sum2 = 0;
        for(int number: array){
            sum2 += number;
        }
        System.out.println("The sum of second array of numbers:  "+sum2
        );
    }
}
