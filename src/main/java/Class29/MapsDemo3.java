package Class29;

import java.util.HashMap;

public class MapsDemo3 {
    public static void main(String[] args) {
    /*
    Create a Map of building. Store the floor  number and its associated company name. EX: 1=Google, 2=Syntax
    Insert 7 entries with duplicate keys and values
    Check how many entries you have? Update company on a 4th floor. Remove company on 7th floor. print your Map.
     */
        HashMap<Integer,String> floor= new HashMap<>();
        floor.put(1,"Google");
        floor.put(2,"Syntax");
        floor.put(3,"Apple");
        floor.put(4,"IBM");
        floor.put(5,"Samsung");
        floor.put(6,"McDonald");
        floor.put(7,"Burger King");

        System.out.println(floor);
        System.out.println(floor.size());

        floor.replace(4,"Facebook");
        System.out.println(floor);

        floor.remove(7);
        System.out.println(floor);


    }
}
