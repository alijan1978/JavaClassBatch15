//package Review2;
//
//public class NestedIf {
//    public static void main(String[] args) {
//        /*
//        Nested if: One if condition is inside another if condition/statement
//        Or one condition depends on the other one ... example of doctor visit "Do you have allergy?"
//        if Yes, what type of allergy you have?
//         */
//        boolean vaccine = true;//If outer condition is false, the code stops and does not executed. it goes to the last else statement
//        int vaccineDose = 1;
//
//        if(vaccine){ // Outer if
//            System.out.println("How many doses you have");
//            if(vaccineDose == 1){ // Inner if
//                System.out.println("You need a booster shot");
//            }else {
//                System.out.println("You are fully  vaccinated");
//            }
//        }else {
//            System.out.println("I don't have vaccine");
//        }
//
//
//    }
//}
