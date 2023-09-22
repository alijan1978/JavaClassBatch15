package Class4;

public class IfElseConditions2 {
    public static void main(String[] args) {

        boolean rain=false;

        if(rain){
            System.out.println("Lets take the umbrella"); // Plan A
            // If this condition fail, we go to Else part, plan B

        }else {
            System.out.println("Lets just take the hat, no worries"); // Plan B
        }

        // Create a boolean variable and call it break, if it contains true, print "Lets take the break otherwise
        // print "Lets continue the class"
        boolean breaktime=true;
        if(breaktime) {
            System.out.println("Lets take the break");
        }else {
            System.out.println("Lets continue the class");
        }
    }
}
