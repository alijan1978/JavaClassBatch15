//package JavaReview12;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//public class CheckedVsUnchecked {
//    public static void main(String[] args) {
//
///* Exceptions can occur because of two main reasons, one could be the mistake of programmer or human error
//    and the second is because of external resources on which the program is dependent. in below code, we get
//    ArithmeticException and its unchecked because here Java doesn't recommend or force us to use try-catch block.
//    So in Human error can be avoided by simple writing of good code or it may be fixed by ifElse conditions... called unchecked exception
// */
//        System.out.println(10/0); // by number cannot be divided by 0
//
//        System.out.println("-----Checked Exception---------------\n");
//// This below is Checked Exception: the code is written good, but the outside/external resource which is the excel file you
//// paste the path in parameters is not available,,, the file might not be available in your computer.... Java recommends/force
//// to use exception or try-catch block to avoid this. So, hover mouse on FileInputStream and then click on 'More Action' and
// // choose surround by try-catch block
//
//        try {
//            FileInputStream fileInputStream = new FileInputStream("Files/My Family.xlsx");
//        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
//            System.out.println(e);
//        }
//// video 16 min 1:44
//    }
//}
