package Class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);
        System.out.println(numbers);
        // Write a logic to remove Duplicate values from the ArrayList

        LinkedHashSet<Integer> num = new LinkedHashSet<>(numbers);
            System.out.println(num); // Data is sorted and duplicates are removed





    }
}
