package Class2;

public class VariablesDemo2 {
    public static void main(String[] args) {

        int numberBox = 10; // We don't need to define the datatype again if we Reassign the value
                            // just use it once, Java remembers it
        numberBox = 20;

        //Java is executing Top to Bottom, it prints out the last line OR last command (its Override/Reassign number)
        System.out.println(numberBox);
        numberBox = 200;
        System.out.println(numberBox);
        numberBox = 300;
        System.out.println(numberBox);

        System.out.println(numberBox+50);





    }
}
