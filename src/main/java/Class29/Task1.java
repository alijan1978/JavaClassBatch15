package Class29;

import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make that Insertion Order is maintained.
        Then remove any city that starts with 'A'.
         */

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Richmond");
        cities.add("FairFax");
        cities.add("Mclean");
        cities.add("Annandale");
        cities.add("Roseville");
        cities.add("AlPachino");
        cities.add("Sacramento");

        System.out.println(cities);

        cities.removeIf(x-> x.startsWith("A"));
        System.out.println(cities);



    }
}
