package Class28;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of cars and retries all the values using 3 different ways:
         */
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("JMC");
        System.out.println(cars); // One way to print all values/elements of ArrayList

        System.out.println("---For Each Loop -----\n");

        for (String car : cars) {
            System.out.println(car);// Second way using For Each Loop to print all values of ArrayList
        }
        System.out.println("---For Loop ------\n");

        for (int i = 0; i < cars.size(); i++) { // Third way using Normal For Loop
            String car = cars.get(i);
            System.out.println(car);
        }

        }
}
