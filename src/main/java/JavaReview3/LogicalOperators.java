//package Reviewclass3;
//
//public class LogicalOperators {
//    public static void main(String[] args) {
//
//        boolean loginButtonDisplayed=true;
//
//        boolean loginButtonClickable=true;
//
//        // if True && True => true
//        // if True && False => false
//        // if we have one false condition within AND && operator, the result is -> false
//        // Best practice is that if we have two true condition, we use AND && operator...
//        //BUT if we have one True and one false , we should go for || OR operator
//    System.out.println("===== AND && example ========================\n");
//
//        if(loginButtonDisplayed && loginButtonClickable){
//            System.out.println("Test case is passed");
//        }else {
//            System.out.println("Test case failed");
//        }
//
//   System.out.println("===== OR || example ==============\n");
//
//        boolean dashboard=false;
//
//        String message="Welcome Admin";
//
//        // If True || True => true
//        // if we have one true in OR || operator, the result is -> true
//
//        if(dashboard || message.equals("Welcome Admin")){
//            System.out.println("User is successfully logged in");
//        }else {
//            System.out.println("User is Not logged in");
//        }
//
//   System.out.println("===== Not ! operator ==============\n");
//
//        boolean b=true;
//
//        System.out.println(!b);// prints false
//
//        boolean agreeCheckboxSelected   = false;
//
//        if(! agreeCheckboxSelected){
//            System.out.println("I should click on checkbox");
//        }else {
//            System.out.println("I am clicking on Submit button because its already checked");
//        }
//
//    }
//}
