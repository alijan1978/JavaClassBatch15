package Class28;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        // LinkedHashSet does not allow Duplicates, but Retain the Insertion Order
        LinkedHashSet<String> fruits=new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Strawberry");
        fruits.add("Apple");

        System.out.println(fruits);

    }
}
