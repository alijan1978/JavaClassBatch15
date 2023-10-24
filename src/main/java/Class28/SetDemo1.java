package Class28;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {

        // HashSet does not allow duplicate values and doesn't maintain Insertion Order
        // ArrayList & LinkedList maintain Insertion Order

        HashSet<String> fruits=new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Strawberry");
        fruits.add("Apple");

        System.out.println(fruits); // does not allow duplicate value of 'Apple'


    }
}
