package Class4;

public class IfElseIfCondition3 {
    public static void main(String[] args) {

        // with IfElseIf, we give more conditions

        int day=5; // = assign value to a variable

        if(day==1){ // we compare two values / If the condition block is true, it will print. otherwise, it jumps to else if
            System.out.println("Today is Monday");
        }else if(day==2){
            System.out.println("Today is Tuesday"); // else block of code
        }else if(day==3){
            System.out.println("Today is Wednesday");
        }else if(day==4){
            System.out.println("Today is Thursday");
        }else if(day==5){
            System.out.println("Today is Friday");
        }else if(day==6){
            System.out.println("Today is Saturday");
        }else if(day==7){
            System.out.println("Today is Sunday");
        }else {
            System.out.println("Wrong day of the week");
        }
    }
}
