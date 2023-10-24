package Class29;

import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries.
        In this Set, we want all objects to be sorted in Alphabetical orders.
        Using 2 different ways retrieve all elements from SEt.
         */

        TreeSet<String> countries=new TreeSet<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Brazil");
        countries.add("Argentina");
        countries.add("Germany");

        System.out.println(countries);

        for(String country : countries){
            System.out.println(country);
        }


    }
}
