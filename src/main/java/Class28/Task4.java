package Class28;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of drinks. If any drink has letter 'a' or 'e' replace it with Water
         */

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Wine");
        drinks.add("Pepsi");
        drinks.add("Cola");
        drinks.add("Red Bull");
        drinks.add("Beer");
        drinks.add("Milk");
        drinks.add("Smoothi");

        for (int i = 0; i < drinks.size(); i++) {
            String drink=drinks.get(i);
            if(drink.contains("a") || drink.contains("e")){
                drinks.set(i, "WATER"); // set() method replace value.... 'i' is used instead of index
            }
        }
        System.out.println(drinks);



    }
}
