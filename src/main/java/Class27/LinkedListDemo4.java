//package Class27;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class LinkedListDemo4 {
//    public static void main(String[] args) {
//
//        // For 1000000 numbers looping through LinkedList takes 168 Milli-seconds
//        long startTime = System.currentTimeMillis();
//       LinkedList<String> numbers = new LinkedList<>();
//        for (int i = 0; i < 1000000; i++) {
//          numbers.add(0,"Test Data");
//        }
////
////        // But the same number 1000000 looping with ArrayList takes 106237  which is 632 times the code got slower
////        ArrayList<String> numbers = new ArrayList<>();
////        for (int i = 0; i < 1000000; i++) {
////            numbers.add(0,"Test Data");
////        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-startTime);
//
//
//    }
//}
