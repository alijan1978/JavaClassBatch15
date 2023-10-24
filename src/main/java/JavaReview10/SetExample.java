//package JavaReview10;
//
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class SetExample {
//    public static void main(String[] args) {
//// Set is a collection of unique element
//        Set<String> qaJobs = new HashSet<>();
//        // adding object/elements to the collection
//
//        qaJobs.add("Automation Engineer");
//        qaJobs.add("Manual Tester");
//        qaJobs.add("SDET");
//        qaJobs.add("QA Analyst");
//        qaJobs.add("API Tester");
//
//        System.out.println(qaJobs);
//
//        qaJobs.remove("Manual Tester");
//        System.out.println("Removed Manual Tester element "+qaJobs);
//        qaJobs.add("API Tester");
//        qaJobs.add("API Tester"); // allow duplicates
//        qaJobs.add("Databae Tester");
//        System.out.println("Added duplicate role of API Tester: "+qaJobs);
//
//        System.out.println("----------------------\n");
//
////        Set<String> sets=new LinkedHashSet<>(qaJobs); // one way to add all data because LinkedHashSet has option
//        Set<String> hashSet= new LinkedHashSet<>();
//        hashSet.addAll(qaJobs); // by addAll() method
//
//        System.out.println("LinkedHashSet = "+hashSet);
//
//        System.out.println("---------TreeSet -----------------\n");
//        //Doesn't maintain insertion order
//        //BUT sorts out array based on alphabetical order or chronological order
//
//        Set<String> treeSet=new TreeSet<>();
//
//        treeSet.addAll(qaJobs);
//        System.out.println("TreeSet = "+treeSet);
//
//    }
//}
