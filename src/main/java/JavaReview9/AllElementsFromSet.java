package JavaReview9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElementsFromSet {
    public static void main(String[] args) {

        Set<String> qaJobs = new LinkedHashSet<>();

        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("API Tester");

        System.out.println(qaJobs);
    // How to get all values from a Set, we have two option
    // 1. Enhanced For Loop 2. Iterator() method ...
    // we can use iterator() method for all collection interfaces
    // Inside iterator() method, we have hasNext(), next(), remove()
        System.out.println();
        System.out.println("------using Enhanced For Loop------------\n");

    for(String qa : qaJobs){
        System.out.println(qa);
    }
        System.out.println("-----using iterator() method-------------\n");

     Iterator<String> iterator = qaJobs.iterator();

    while (iterator.hasNext()){ // since we don't know how many times to iterate, we use while Loop
        String elements= iterator.next();
        System.out.println(elements);

        // its always better to use while loop for iterator() method, otherwise manually takes time, example below:
        // repeating code and doesn't look good

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
    }

    } // Video 12 - min 1:25 Map
}
