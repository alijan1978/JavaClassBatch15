//package JavaReviewClass4;
//
//public class NestedLoops {
//    public static void main(String[] args) {
//
//// Nested loop => Loop inside another loop
//
//        for (int i = 1; i <= 3; i++) { // Outer Loop
//            System.out.println(i);
//
//            for (int j = 1; j <= 4; j++) { // Inner loop ... always depends on outer loop
//                System.out.println(j);
//       // if the outer loop condition is false, execution stops and JVM doesn't care about inner loop
//       // But if the outer loop condition it true, so the loops will go to inner loop and executes it based on number of condition
//       // Also if outer loop condition is 5 times, we know that the entire condition of inner loop repeats 5 times
//            }
//        }
//        System.out.println("---------------------\n");
//
//        for (int i = 1; i < 5; i++) {
//            System.out.println("Hello my family");
//
//            for (int j = 1; j <= 2 ; j++) {
//                System.out.println("Have a good day my family");
//
//            }
//
//        }
//
//
//
//    }
//}
