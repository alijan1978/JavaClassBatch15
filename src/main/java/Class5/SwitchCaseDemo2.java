package Class5;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {

        int day=8;
        switch (day){

            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is SUNDAY");
                break;
            default:
                System.out.println("You entered Wrong day of the week");

        }
    }
}
