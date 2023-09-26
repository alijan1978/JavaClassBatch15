package Class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        // Create an empty array then store 45, 44, 33, 20, 10 in it.
        // Then, use a loop to add all the elements which exists in even indexes.



    int [] numbers = new int[5];
    numbers[0]=45;
    numbers[1]=44;
    numbers[2]=33;
    numbers[3]=20;
    numbers[4]=10;

        int sum =0; // we need variable of sum to add all the numbers

        for (int i = 0; i < numbers.length; i++) {

            if(i % 2 ==0){
                sum = sum + numbers[i];
            }
        }

        System.out.println("The sum of all numbers in even indexes are:  "+sum);
    }
}
