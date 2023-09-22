package Class7;

public class ForLoops {
    public static void main(String[] args) {

        // When we know exactly how many times we want to loop / repeat through the block of code, use For Loop.
        // when we don't know how many times we need to repeat,  we should use while Loop most of time.
        // For loop: the code is easier and shorter , readable too

        System.out.println("----------While Loop ---------------\n");

        int number = 0;
        while (number<10){
            System.out.println(number);
            number++;
        }
        // For Loop: initialize , condition, increment or decrement
        System.out.println("-------For Loop -------------------------\n");

        for (int i=0; i < 10; i ++){
            System.out.println(i);
        }



    }
}
