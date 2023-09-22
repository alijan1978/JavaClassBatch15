package Class15;

public class TernaryOperator {
    public static void main(String[] args) {

        int number=0;

        if(3>2){
            number=10;
        }else {
            number=20;
        }
        System.out.println(number);

        // Now we use shortcut using Ternary operator

        number=(3>2) ? 10:20; // shorter way of if else condition
//        number=(3>2) ? (4>5) ? 15:65:20; // Nested condition

        System.out.println(number);
    }
}
