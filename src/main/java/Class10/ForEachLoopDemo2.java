package Class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int[] array={10,13,20,25,45,50};
        array[2]=85; // This is how we update a single element using its index in the array (20 is updated to 85)

        // Print ONLY the odd numbers from this array with normal for Loop
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }
        // Replace/Update all the odd numbers in this with help of normal For Loop
        for (int i = 0; i < array.length; i++) {
            if(array[i] %2 != 0){
                array[i] = 0; // Replacing all Odd numbers to zero " 0 "
            }
        }
        System.out.println("After replacing all Odd numbers to zero ");

        for (int i = 0;  i < array.length; i++) {

            System.out.println(array[i]);
        }


    }
}
