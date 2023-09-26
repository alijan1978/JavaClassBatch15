package Class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

        // Create an array and store 10, 20, 30, 4, 5, 6, 7, 80
        // then, add all the elements which are multiple of 2

        int [] array = {10, 20, 30, 4, 5, 6, 7, 80};
        int sum = 0;// for adding all numbers

        for (int i = 0; i < array.length; i++) {

            if(array[i] % 2 ==0){

                sum = sum + array[i];
            }
        }

        System.out.println("The total of elements multiple of 2 are:  "+sum);
    }
}
