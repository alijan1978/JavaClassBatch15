package Class14;

public class Task3 {
    public static void main(String[] args) {

        /* You have a String a="Is it Saturday? Is it Raining? Do we have a Java class today?".
            Find out how many sentences are in there in this String.
         */

        String string = "Is it Saturday? Is it Raining? Do we have a Java class today?";
//        String [] array = string.split(" ");
//        String [] array2 = string.split("[?]");// how many sentences
        System.out.println(string.split("[?]").length);

//        System.out.println(array.length);
//        System.out.println(array[2]);


    }
}
