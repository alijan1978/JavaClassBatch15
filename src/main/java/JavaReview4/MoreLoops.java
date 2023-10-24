//package JavaReviewClass4;
//
//public class MoreLoops {
//    public static void main(String[] args) {
//
//        for (int i = 0; i <= 3 ; i++) {
//            System.out.println(i); // here it prints 0 1 2 3
//
//            for (int j = 1; j >= 3 ; j++) {
//                // here inner condition is false, Not gets executed so goes back to outer loops
//                System.out.println(j);
//
//            }
//        }
//        System.out.println("------------same above code -------\n");
//
//        for (int i = 0; i <= 3 ; i++) {
//
//            for (int j = 1; j <= 3 ; j++) {
//
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("--------- Example of Zero Mileage Car usage--------------\n");
//        // This below example is like a New car with zero mileage... always the inner loops continues
//        // until it reaches to its condition and then goes to the outer loop same like seeing mileage in car dashboard
//// Here we set the Mileage to 9999 , so the loop starts from 0 to 9999
//// First loops outer loop, then goes inside inner loop all three different conditions one by one, then goes to outer loop again
//
//        for (int i = 0; i <= 9 ; i++) {
//            for (int j = 0; j <= 9 ; j++) {
//                for (int k = 0; k <= 9; k++) {
//                    for (int l = 0; l <= 9; l++) {
//
//                        System.out.println(i+" "+j+" "+k+" "+l);
//
//                    }
//
//                }
//
//            }
//
//
//        }
//
//    }
//}
