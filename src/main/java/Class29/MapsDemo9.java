package Class29;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
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

        var values = countries.values();
        for(var value : values){
            System.out.println(value);
        }
        System.out.println("--------------------\n");

        var iterator=countries.values().iterator();
        while (iterator.hasNext()){
            var value = iterator.next();
            System.out.println(value);
        }

    }
}
