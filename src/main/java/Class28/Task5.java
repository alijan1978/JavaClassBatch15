package Class28;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of Even Numbers from 1 - 500. Remove any number that is divisible by 5 from that ArrayList
         */
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <= 500; i+=2) { // gives us Even Number
            numbers.add(i);
        }
        numbers.removeIf(x-> x % 5 ==0); // using Lambda expression to remove numbers if divisible by 5
        System.out.println(numbers);

    }
}
