package Class28;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        // TreeSet doesn't allow duplicate, no insertion order, BUT prints based on Alphabetical order
        TreeSet<String> fruits=new TreeSet<>();
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
