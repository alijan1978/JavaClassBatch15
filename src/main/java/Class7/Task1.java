package Class7;

public class Task1 {
    public static void main(String[] args) {

        /* Create a boolean variable workDay and assign it to true.
        Create int variable day and assign it to 1.
        As long as it is workDay, print "I need a day off" and increase the day.
        once days is 6, print " I don't need a day off anymore".
         */

        boolean workDay = true;
        int day = 1;
        while (workDay) {
            if (day <= 5) {
                System.out.println("I need a day off");
            }else {
                System.out.println("I don't need a day off anymore ");
                workDay = false; // we make it equal to  false value to not repeat code after 8 days
            }
            day ++; // if we write  day=day+1; OR day+=1 ... are the same
        }
    }
}
