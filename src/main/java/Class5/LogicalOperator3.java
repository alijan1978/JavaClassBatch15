package Class5;

public class LogicalOperator3 {
    public static void main(String[] args) {

        // since here is one true condition in below, it prints true OR 1
        if(10>5 ||4>6){
            System.out.println("1");
        }else {
            System.out.println("2");
        }

        //If there is one False condition among other condition in AND == operator, it prints false
        String name = "Adam";
        int age =30;
        if(name.equals("Adam") && age == 30){
            System.out.println("You are the Adam from Bath 13");
        }else {
            System.out.println("I dont know you");
        }

        // ! NOT operator makes true to false and false to true
        boolean married = true;
        boolean marriedLife= ! married;
        if( ! married){
            System.out.println("You are independent");
        }else {
            System.out.println("You have a Boss at home hahahah");
        }
    }
}
