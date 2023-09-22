package Class4;

public class IfConditionDemo_1 {
    public static void main(String[] args) {

        int money = 15000;

        if (money > 1000) {
            System.out.println("Lets buy an iPhone");
        }

        if (money > 2000) {
            System.out.println("Lets also buy a MacBook");
        }

        boolean mothersDay = true;

        if (mothersDay) {
            System.out.println("Happy Mothers Day");
        }

        String name = "Wajia jan";

        //if(name.equals("Wajia jan"){ ... we can also write like this.
        // But Equals method is only used for non-primitives datatype

        if (name.equals(name)) {
            System.out.println("I love football");
        }
    }
}
