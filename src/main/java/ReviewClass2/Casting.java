package ReviewClass2;

public class Casting {
    public static void main(String[] args) {

  // Main method is an Entrance to our program, its like a main door and without main method we cannot perform printing

  // Casting -> Convert 1 data type to another type
  // 1. Widening/Implicit or automatic / UP Casting
  // 2. Narrowing/Explicit or Manual / Down Casting
  /*
Upcasting: We go from small data type to bigger type: byte -> short -> int -> long -> float -> double
DownCasting: We go opposite, double -> float -> long -> int -> short -> byte
      */
        //Example of Widening or Upcasting
        double  data = 5; // its int data type value because it doesn't have decimal... but automatically changed to double
        System.out.println(data); // 5.9 -> my smaller data type int has converted to bigger type double,

        // Narrowing or DownCasting ... has to be done Manually because Java doesn't accept it, but we do it explicitly
//        int intData = 5.0; // its bigger value of int, cannot do down to short or byte... but we do downcasting manually
        int intData = (int) 5.0;
        System.out.println(intData); //  Result is 5 from bigger to smaller

//        byte byteData = (byte) 128; // OR we can do as following:
        int number = 128;
        byte byteData = (byte) number;
        System.out.println(byteData);// 128 is bigger for byte , but we manually explicitly force it


    }
}
