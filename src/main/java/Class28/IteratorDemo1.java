package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(14.0);
        numbers.add(20.0);
        numbers.add(30.0);
        numbers.add(40.0);
        numbers.add(50.0);
        numbers.add(60.0);
        numbers.add(70.0);

//        numbers.remove(60.0); // we can remove Manually too by entering the value... its overloading
//        numbers.remove(2); // Or Manually remove by index number which is 30.0 ... its overloading
//        System.out.println(numbers);

//      Lambda Expression -> says: from numbers Arraylist, remove the elements if they are greater than 15
//        numbers.removeIf(num -> num > 15); // using Lambda Expression ->
//        System.out.println(numbers); // So all the numbers greater than 15 are Removed

        // Or we can get Object of Iterator
        Iterator<Double> iterator = numbers.iterator();

//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(numbers);
        // hasNext() always gives us True because when it checks it sees that there is element left less than 15 to iterate/loop
        // but when we use next() it goes to the last element to check and if it doesn't have it have element less than 15,
        // it doesn't loop/iterating
        // The best thing is to use While Loop with the help of of hasNext() and then next() inside iterator.

        // Here hasNext() keeps on returning True as long as there are elements left to be iterated
        while (iterator.hasNext()){ // while loop is OutDated, that's why it has yellow highlight that says replace it with Lambda
            double number=iterator.next();
            if(number > 15){
                iterator.remove(); // But instead of while Loop with four line, we can use ONE line of Lambda Expression
            }
        }

        System.out.println(numbers);

    }
}
