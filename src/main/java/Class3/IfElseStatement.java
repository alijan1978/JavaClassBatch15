package Class3;

public class IfElseStatement {
    public static void main(String[] args) {

        int money = 1500;
        System.out.println(money >= 300);
        //-------------- true or false ------------------\n

        if(money >= 300){
            System.out.println("Yes, it is greater, lets go for shopping");
        }

        if(money <= 2000){
            System.out.println("Oh No, I need more money to go for shopping");
        }
    }
}
