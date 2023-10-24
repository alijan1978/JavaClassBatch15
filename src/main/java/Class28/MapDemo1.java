package Class28;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo1 {
    public static void main(String[] args) {

    // Map interface is not part of the Collection. it contains pair values of data type
    // HashMap doesnt maintain insertion order
    // But LinkedHashMap maintain insertion order

//  HashMap<String,Integer> groceries=new HashMap<>(); // we use put() method to add element
//  LinkedHashMap<String,Integer> groceries=new LinkedHashMap<>(); // maintain insertion order
// TreeMap sorts alphabetically, chronologically

        TreeMap<String,Integer> groceries=new TreeMap<>();
        groceries.put("Egg", 10);
        groceries.put("Milk", 5);
        groceries.put("Bread", 3);
        groceries.put("Banana", 6);
        groceries.put("Potato", 10);
        groceries.put("Soap", 7);

        System.out.println(groceries.get("Potato"));// with get() method to print the index number with the help of Key Object
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        System.out.println(groceries.containsKey("Soap"));
        groceries.remove("Soap");
        System.out.println(groceries);

    }
}
