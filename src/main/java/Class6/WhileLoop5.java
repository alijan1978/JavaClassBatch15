package Class6;

public class WhileLoop5 {
    public static void main(String[] args) {

        int number=1;

        boolean flag = true;
        while (flag){

            System.out.println(number);
            if(number > 3){
                flag = false; // If the flag value is not false, then it will have infinite loop
                // but now as long as the flag value is false, it will loop until the condition number > 3 is true
            }

            number ++;
        }
    }
}
