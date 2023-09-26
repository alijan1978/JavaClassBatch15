package ReviewClass2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        Nested if: One condition is inside another if statement
        Or one condition depends on the other one ... example of doctor visit "Do you alergy?" Yes, what type of alergy?
         */
        boolean vaccine = true;//If outer condition is false, the code stops not executed. it goes to the last else statement
        int vaccineDose = 1;

        if(vaccine){ // Outer if
            System.out.println("How many doses you have");
            if(vaccineDose == 1){ // Inner if
                System.out.println("You need a booster shot");
            }else {
                System.out.println("You are fully  vaccinated");
            }
        }else {
            System.out.println("I don't have vaccine");
        }


    }
}
