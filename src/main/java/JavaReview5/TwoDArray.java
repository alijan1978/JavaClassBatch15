//package JavaReviewClass5;
//
//public class TwoDArray {
//    public static void main(String[] args) {
//
//        int[][] array={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9,10},
//                {100,200}
//        };
//// Getting all values from 2D Array
//
//        for(int []arr : array){ //outer loop iterates over arrays
//            for (int num : arr){ // inner loop iterates over each element
//                System.out.println(num);
//            }
//            System.out.println();
//        }
//        System.out.println("-----------------Print Even numbers-----------------------\n");
//
//        for(int []arr : array){
//            for (int num : arr){
//                if(num%2==0){
//                    System.out.println(num+" ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("----Gelling all values using Regular For Loop---------");
//
//        for (int row = 0; row < array.length; row++) { // outer loop iterates over rows
//            for (int col = 0; col < array[row].length; col++) { // inner loops iterates over each column
//
//                System.out.println(array[row][col]);
//            }
//        }
//
//        System.out.println("--- Getting Odd Rows------\n");
//
//        for (int row = 0; row < array.length; row++) { // outer loop iterates over rows
//            for (int col = 0; col < array[row].length; col++) { // inner loops iterates over each column
//
//                if(row%2 != 0){ // print from the Odd Rows only
//                    System.out.println(array[row][col]+" ");
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println("----------------Different methods-----------------------------");
//
//        int numberOfArrays=array.length; // how many arrays do I have
//        System.out.println(numberOfArrays);
//
//        int numberOfElementsInArray=array[0].length; // number of elements in first array
//        System.out.println(numberOfElementsInArray);
//
//        int numberOfElementsIn4Array = array[3].length; // Array 4 has two elements
//        System.out.println(numberOfElementsIn4Array);
//
//        System.out.println(array[2][2]); // access number 0 in array 2 (based on indexes)
//
//    }
//}
