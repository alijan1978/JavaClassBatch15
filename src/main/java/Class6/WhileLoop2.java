package Class6;

public class WhileLoop2 {
    public static void main(String[] args) {

        int number = 1;
        while (number < 5){
            System.out.println(number);
            number ++;
        }

        System.out.println("***********************************\n");
        int number2 = 0;
        while (number2 < 10){
            System.out.println(number2);
            number2 += 2; // value is incremented by 2 ... so it loops by even number
        }

    }
}
