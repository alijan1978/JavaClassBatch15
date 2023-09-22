package Class3;

public class TypeCasting_5 {
    public static void main(String[] args) {

     // Typecasting take different values of different datatype boxes & fit it into a different datatype boxes/container
    // By Typecasting we force Java to accept this and say "this is fine".
        // First Java complains, but we put the same datatype after assignment operator ( = ) within parenthesis ...
         // --> Just if from larger datatype to a smaller datatype , because of the box's size

        // If we try to store the contents /value from a smaller box to a larger box, Java doesn't complain because
        // the content can easily fit inside the larger box, BUT if we try to put the larger box to a smaller, we need
        // typecast to force Java to store the content.
        // Using Typecasting is very Rare... just in cases if the developer codes are written in different datatype
        long number = 125;
        byte shorterNumber = (byte) number;
        System.out.println(shorterNumber);

        byte smallBox = 10;
        int largeBox = smallBox; // without Typecasting
        System.out.println(largeBox);

        float number1 = 10.5f;
        int number2 = (int) number1; // Here it only takes the Whole number Not the decimal part
        System.out.println(number2);

        float eggs = 12.5f;
        int wholePart = (int) eggs; // Type casting is called conversion from Float to int
        System.out.println(wholePart);

        // Important : Learn ASCI numbers... which shows behind every character there is numbers that you can use too
        //Example:
        System.out.println((char) 65); // 65 represents alphabet A... so Java prints "A" in console
        System.out.println((char) 98); // 98 represents alphabet B... so Java prints "B" in console

    }
}
