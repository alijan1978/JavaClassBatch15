package Class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

        System.out.println(true || true); // both true
        System.out.println(true || false); // one is true, prints it true if one is correct, as long as there is on True
        System.out.println(false || false); // if both are false, then its not correct and print it false

        boolean boughtJewelery = false;
        boolean boughtFlowers = false;

        if(boughtFlowers || boughtJewelery){
            System.out.println("My wife is happy ");
        }else {
            System.out.println("My wife will get Sad");
        }

        boolean wifi = false;
        boolean fiveG = false;

        if(wifi || fiveG){
            System.out.println("You are good for browsing the internet");
        }else {
            System.out.println("Either connect to wifi OR to 5G");
        }

    }
}
