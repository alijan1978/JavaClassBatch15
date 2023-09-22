package Class4;

public class NestedIf {
    public static void main(String[] args) {

        int money = 1000;
        String day = "Sunday";
        boolean mood = true;
        //NestedIf --> If condition inside another if condition

        if (money > 700) { // If this condition is true, Java will print this block of code, otherwise it Won't

            if (mood) {
                System.out.println("Lets go for shopping");
            }
        } else {
            System.out.println("Lets first save some money");
        }

        //We can do it through logical operator as well, below:

//        if(money>800 && (mood)){
//            System.out.println(" let go shopping");
//        }

    }
}
