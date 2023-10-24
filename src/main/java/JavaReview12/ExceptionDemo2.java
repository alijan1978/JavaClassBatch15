//package JavaReview12;
//
//public class ExceptionDemo2 {
//    public static void main(String[] args) {
//
//        String name = "Batch 15 is Smart";
//        // we put the problematic code inside try block
//        try {
//            System.out.println(name.charAt(-1));
//        }catch (StringIndexOutOfBoundsException e){
////            e.printStackTrace(); // But for some company's security issue, its not good to print all StackTrace
//            System.out.println(e.getMessage()); // Just we can print the error message... I commented off previous code
//            System.out.println(e); // this will print the complete information about exception class and error message
//
//        }catch (NullPointerException npe){ // its like ifElseIf condition
//            System.out.println(npe.getMessage());
//
//        }catch (Exception e){ // Exception is Parent of all runtime exception classes... here we put it like the same as in else { } block of code
//            System.out.println(e);
//    }
//        System.out.println("Rest of the program"); // print my code plus all the StackTrace to find out all the red errors and to fix it
//
//
//
//
//
//
//
//    }
//}