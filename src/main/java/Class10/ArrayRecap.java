package Class10;

public class ArrayRecap {
    public static void main(String[] args) {

        //Create an array of int datatype and store 1 - 5 into it.

        int [] array = {10,20,30,40,50};
        System.out.println(array[4]); // to get number 50, we go by its index number which is 4

        System.out.println(array[1]+" "+array[4]); // to get number 10 and 50 by its indexes

        for (int i = 0; i < array.length; i++) { // to get all the numbers

            System.out.println(array[i]);
        }

        System.out.println("------using Enhanced For Loop ----------\n");
        // Using Enhanced For Loop to get all the numbers

        for(int number: array){
            System.out.println(number);
        }



    }
}
