package Class29;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task {
    public static void main(String[] args) {
        /*
        Create a Map of countries with its capital that will store countries in Alphabetical order.
        Print all keys and values from a country map using For Each Loop and iterator.
        Print all values from a country map using ForEach Loop and iterator
         */

        Map<String,String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", "Washington D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");
        countries.put("German", "Berlin");

//      Set<Entry<String,String>> entrySet=countries.entrySet(); // Instead of doing long code, use 'var' keyword
        var entrySet=countries.entrySet();
        for(var entry : entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println(" ---------\n");

        var iterator = countries.entrySet().iterator();
        while (iterator.hasNext()){
            var entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
