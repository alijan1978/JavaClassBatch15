package Class7;

public class WhileLoopRecap {
    public static void main(String[] args) {

     // If we want to print our desired code more, its not scalable or not good to type and print it as below:
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

     // Therefore, we use While Loop in the following syntax and bring many changes to it as we want:
        System.out.println("--------- using While Loop-------------\n");

        int number = 10;
        while (number < 20 ){
            System.out.println(number<20);
            if(number<15){
                System.out.println("The number is less than 15");
            }else {
                System.out.println("The number is greater than 15");
            }
            System.out.println(number);
            number ++;
        }
    }
}
