//package JavaReview12;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//public class ThrowsKeyword {
//    public static void main(String[] args) throws FileNotFoundException {
//
//        // throws keyword is used to indicate that a method should throw an exception.
//        // try-catch block should have been used, but it not done. so the underline red error shows that...
//        // it's giving responsibility to someone else to fix it, not good. so we force JVM to add exception to handle it.
//
//        method();
//
//    }
//
//    // throws keyword deals with Checked method in below ... we can avoid error by two ways.
//    // 1. use of try-catch block 2. Add exception to method signature...
//
//    // throws FileNotFoundException :
//    // means this method contains piece of code inside this method which deals with checked exception, someone
//    // didn't use try-catch block to avoid this error, be careful that whoever is calling this method might throw exception or error
//
//    static void method() throws FileNotFoundException {
//        FileInputStream fileInputStream=new FileInputStream("asljsdkfj");
//    }
//
//}
