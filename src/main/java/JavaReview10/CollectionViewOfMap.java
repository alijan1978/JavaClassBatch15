//package JavaReview10;
//
//import java.util.*;
//
//public class CollectionViewOfMap {
//    public static void main(String[] args) {
//
//        Map<String,Double> newList=new LinkedHashMap<>();
//
//        newList.put("Milk", 5.99);
//        newList.put("Eggs", 4.95);
//        newList.put("Bread", 2.99);
//        newList.put("Tea", 3.99);
//        newList.put("Coffee", 4.95);
//        newList.put("Eggs", 7.95);
//        newList.put("Coffee", 5.95);
//
//        // To retrieve just the objects or (keys) without keys, we use from Collection 'Set'
//        Set<String> key=newList.keySet();
//        System.out.println(key);
//
//        for(String k: key){
//            System.out.println(k+" = "+newList.get(k));
//        }
//        System.out.println("-----using iterator---------\n");
//// next() returns / gives our object
////hasNext() makes sure the object exists
//
//        Iterator<String> iterator = key.iterator();
//
//        while (iterator.hasNext()){
//            String ke=iterator.next();
//            System.out.println( ke+" = "+newList.get(ke));
//        }
//// Now we want to retrieve all the values from out map
//        // we store it inside Collection interface coz its Parent of all, to get my values (maintain orders and allow duplicates)
//        System.out.println("----------------------------------\n");
//
//        Collection<Double> values=newList.values();
//
//        for(double value : values){
//            System.out.println(value);
//        }
//
//    }
//}
