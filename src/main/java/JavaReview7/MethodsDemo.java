//package JavaReview7;
//
//public class MethodsDemo {
//
//    // user defined: with return type and without, with parameters or without parameters
//
//    void  hello(){ // without parameters
//        System.out.println("Hello");
//    }
//
//    void sayHello(String name){ //with parameters
//        System.out.println("Hello "+name);
//    }
//
//// Create a method that returns the largest number between given 2 integer values below
//
//    int findLargestNum(int num1, int num2){
//        if(num1 > num2){
//            return num1;
//        }else {
//            return num2;
//        }
//    }
//// Create a method that returns an average value of 2 decimal values
//     double findAverage(double num1, double num2){
//
//        return (num1 + num2)/2; // gives the average of two numbers in double datatype (20.0(
//     }
//
// // Create a method returns the reverse String from a given String
//
//   StringBuilder reverse(String given){
//        StringBuilder sb= new StringBuilder(given);
//        return sb.reverse();// reverse back to string value
//   }
//// Create a method that will return a Min value from given array
//
//   public static int minFromArray(int[] array){ // static makes the method accessible throughout the class by calling its object
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]<i){
//                min=array[i];
//            }
//        }
//        return min;
//    }
//
//
//
//
//    public static void main(String[] args) {
//
//        String name="Mohammad Ali";
//
//        int characters=name.length();// print the length of my name ... how many characters
//        System.out.println(characters);
//
//        MethodsDemo obj = new MethodsDemo();
//        obj.sayHello(name);
//
//        System.out.println("------ calling return type method created -------\n");
//        int largest= obj.findLargestNum(100, 200);
//        System.out.println("The largest number is: "+largest);
//
//        System.out.println("------- Give me Average of two numbers-------\n");
//
//        System.out.println(obj.findAverage(10,30));
//
//        System.out.println("------ calling toString value-----------\n");
//
//        StringBuilder reverse=obj.reverse("Mohammad Ali ");
//        System.out.println(reverse); // prints reverse  'ilA dammahoM'
//
//        System.out.println("---------------charAt() method--------------\n");
//        String myString ="  Batch15  ";
//        boolean empty = myString.toUpperCase().isEmpty();
//        char character = myString.trim().charAt(2); // trim() removes spaces, chartAt() prints 't' from Batch15
//        System.out.println(character);
//
//        System.out.println("------Calling minimum value from Array-----\n");
//
//        int[] array={10,20,30,50,48,15,5};
//        MethodsDemo.minFromArray(array); //
//        int minimum= minFromArray(array);
//        System.out.println("My min number from array is: "+minimum); // min value or smallest value
//
//
//    }
//
//
//
//
//}
