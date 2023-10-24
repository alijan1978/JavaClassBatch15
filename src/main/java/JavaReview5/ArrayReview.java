//package JavaReview5;
//
//public class ArrayReview {
//    public static void main(String[] args) {
//
//       int a = 10;
//
//       int[] array = new int[3];
//       array[0]=10;
//       array[1]=20;
//       array[2]=30;
//
////        System.out.println(array[4]);// we get errors, ArrayIndexOutOfBoundsException
//        System.out.println(array[2]);
//        System.out.println("Size of the Array is "+array.length);
//
//        for (int i = 0; i < array.length; i++) { // print all values
//            System.out.println(array[i]);
//        }
//        System.out.println("----------With For Each Loop-------------\n");
//        String[] colors={"Black","White","Red","Purple","Blue"};
//        // Anytime we have Arrays, we can use Enhanced For Loop or For each Loop
//
//        for(String color: colors){
//            System.out.println(color+" ");
//        }
//
//        // with For Loop and get the same result
//        System.out.println("------------For Loop---------");
//
//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }
//
//        System.out.println("-----Another way printing values");
//        for(int number : array){
//            System.out.println(number);
//        }
//
//        System.out.println("-----Print in Reverse--------\n");
//
//        // We cannot reverse through Enhanced For loop... so we should use Regular For Loop
//        // Important: we used variable 'i' many times because they are local variable used within one block of code
//        // So the other block of code doesn't recognize 'i' variable, ONLY within same block of code we should change
//
//        for (int i = colors.length-1; i >= 0 ; i--) {
//
//            System.out.println(colors[i]); // print on Reverse, from end to the beginning
//
//        }
//    }
//}
