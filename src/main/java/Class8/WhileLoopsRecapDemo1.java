package Class8;

public class WhileLoopsRecapDemo1 {
    public static void main(String[] args) {

        // write a code to print from 10 8 6 4 2

        int number = 10;
        while (number >= 2) {
            if(number %2==0)
                System.out.println(number);
            number --;
        }
        System.out.println("----- Another Way ----------------\n");

        int number1 = 10;
        while (number1 >= 2) {

                System.out.println(number1);
            number1 -= 2;
        }

        System.out.println("----- with Do while Loop -------------\n");

        int number2 = 10;
        do{
            System.out.println(number2);
            number2 = number2 - 2; // Its the same as Line 20 ( number1 -= 2; )
        }while (number2 >= 2);

    }
}
