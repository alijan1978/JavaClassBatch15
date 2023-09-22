package Class17;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and return Reversed String.
    Method should be available to all classes within your project and accessibility by class name.
     */
    // Instance method doesn't have static keyword, and we should create object of the Class in main method to call it.
    // But if we have static method, we don't need the object of the class to call it, if we are in the same Class.

   public static String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseStr("Monday"));
    }

    // If it is with Instance Method, we call it by Class object as below:

//    public String reverseString(String input){
//       return new StringBuilder(input).reverse().toString();
//    }
//
//    public static void main(String[] args) {
//        Task2 task2=new Task2();
//        task2.reverseString("Monday");;
//    }

}
