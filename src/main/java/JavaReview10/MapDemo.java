//package JavaReview10;
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.TreeMap;
//
//public class MapDemo {
//    public static void main(String[] args) {
//
//        Map<String,Double> groccery  = new HashMap<>();
//        // Key & Value pairs are called entry object
//        groccery.put("Milk", 5.99);
//        groccery.put("Eggs", 4.99);
//        groccery.put("Bread", 2.99);
//        groccery.put("Tea", 3.99);
//        groccery.put("Coffee", 4.95);
//        groccery.put("Eggs", 7.95);
//        groccery.put("Coffee", 5.95);
//
//
//       double teaPrice=groccery.get("Tea"); // returns the value to which the specified object is entered.
//        System.out.println(teaPrice);// since the value is in double datatype, we store it in double to call it.
//// HashMap doesn't allow duplicate entry object, But doesn't keep insertion order.
//        System.out.println(groccery);
//
//        int size=groccery.size();// to get the size of our map entries... value should be int datatype
//        System.out.println("Number of Entry Objects are "+size);
//
//        System.out.println("---------LinkedHashMap----------------------\n");
//
//        Map<String,Double> newList=new LinkedHashMap<>();
//
//        newList.put("Milk", 5.99);
//        newList.put("Eggs", 4.99);
//        newList.put("Bread", 2.99);
//        newList.put("Tea", 3.99);
//        newList.put("Coffee", 4.95);
//        newList.put("Eggs", 7.95);
//        newList.put("Coffee", 5.95);
//
//        System.out.println("Insertion Order is preserved in LinkedHashMap : "+newList);
//
//        System.out.println("---------TreeMap----------------------\n");
//
//        Map<String,Double> list=new TreeMap<>();
//        list.putAll(groccery);
//        list.putAll(newList);
//        System.out.println("The size of TreeMap entry is "+list.size());
//        System.out.println("Sorted Order Alphabetically "+list); // sorts alphabetically
//    }
//}
