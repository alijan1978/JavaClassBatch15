package Class6;

public class WhileLoop {
    public static void main(String[] args) {

        System.out.println("-----------Simple If Condition -----------\n");
        int number = 0;
        if(number < 3){
            System.out.println("Hello World");
        }

        number ++;
        if(number < 3){
            System.out.println("Hello Beautiful World");
        }

        number ++;
        if(number <3){
            System.out.println("Hello Wonderful World");
        }

        System.out.println("-----------using While Loop ------------------\n");
        int number2 = 0;
        while (number2 < 3){ // we get the same result as above by doing while loop, OR we can change number to 10
            // it checks as long as the condition is true... 2 is less than 10 ...
            System.out.println("Hello My beautiful world");
            number2 ++; // increments number by 1
        }






    }
}
