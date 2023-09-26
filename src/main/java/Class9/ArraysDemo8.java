package Class9;

public class ArraysDemo8 {
    public static void main(String[] args) {

        // Write a program that can tell us how many times the number 10.5 is present in the Array

        double[] array = {10.5, 12.0, 45, 10.5, 23, 10.5};

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] == 10.5){
                count ++; // also can write as count = count + 1 ...
            }
        }

        System.out.println("The number 10.5 is present  "+count +" times in this array");


    }
}
