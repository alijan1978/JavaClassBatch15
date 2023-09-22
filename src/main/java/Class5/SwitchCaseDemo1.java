package Class5;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {

        // This is If Statement Example ... Just to compare it with SwitchCaseDemo 2 class
        //IMPORTANT : if we want to change ifStatement to switchStatement just do the following:
        // Put your cursor on "if"condition, on the left side the "bulb" shows up, click on the "bulb"
        // you will get the option to remove ifStatement and replace it to switchStatement, hit Okay

        int day=5; // = assign value to a variable

        if (day == 1) {  // we compare two values / If the condition block is true, it will print. otherwise, it jumps to else if
            System.out.println("Today is Monday");
        } else if (day == 2) {
            System.out.println("Today is Tuesday"); // else block of code
        } else if (day == 3) {
            System.out.println("Today is Wednesday");
        } else if (day == 4) {
            System.out.println("Today is Thursday");
        } else if (day == 5) {
            System.out.println("Today is Friday");
        } else if (day == 6) {
            System.out.println("Today is Saturday");
        } else if (day == 7) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Wrong day of the week");
        }
    }


    }

