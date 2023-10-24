//package JavaReview5;
//
//import java.util.Scanner;
//
//public class ArrayWithScanner {
//    public static void main(String[] args) {
//
//   //Lets create an Array of names using Scanner
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("How many names you want to store");
//        int size=scanner.nextInt();
//        String[] name=new String[size];
//
//    // This For Loop stores elements inside the array
//    // Regular For Loop works with indexes
//        for (int i = 0; i < name.length; i++) {
//
//            System.out.println("Please enter name");
//            name[i] =scanner.next();
//        }
//
//    // Using Enhanced Loop below, we can retrieve element
//    //Enhanced Loop works with variable
//
//        for(String n: name){
//            System.out.println(n);
//        }
//    }
//}
