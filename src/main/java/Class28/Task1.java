package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    /*
    Create an ArrayList that will store 5 names into it. Find out whether the given ArrayList is empty or not?
    check whether the specific name is present in an ArrayList or not?
    Find the size of  your ArrayList and print all values from that
     */
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Wajia");
        names.add("Khajoo");
        names.add("Sadoo");
        names.add("Diloo");
        names.add("Zainabo");
        names.add("Tahseen taq taq");
        names.add("Ali");
        System.out.println(names.isEmpty()); // find out the given ArrayList is empty or not? Answer is False coz its not empty
        System.out.println(names.contains("Zainabo")); // Answer is True, because Zainabo is present
        System.out.println(names.contains("Jan"));// False, Jan is not present
        System.out.println(names.size()); // print the size of my ArrayList which is 7
        System.out.println(names); // print all the value ...

//        or we can use For Each Loop it to print all value of ArrayList
       for(String name : names){
           System.out.println(name);
        }
       // We can also use Normal For Loop to print all value of ArrayList

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);

        }
    }

}
