package Class31;

public class ExceptionsDemo1 {
    public static void main(String[] args) {

        System.out.println("I love my family 10 time");
        System.out.println("I love my family 20 time");
        System.out.println("I love my family 30 time");
        System.out.println("I love my family 40 time");
        System.out.println("I love my family 50 time");
        // Below the code gets a runtime error and stops running program after line 10.
        // to avoid this, we use try catch block so that JVM ignore this error and continue on the rest
       try {
           System.out.println(10/0);
       }catch (Exception e){
           System.out.println(e); // just it prints the error message, but does not affect/stop the rest of code
       }
        System.out.println("I love my family 60 time");
        System.out.println("I love my family 70 time");
        System.out.println("I love my family 80 time");
        System.out.println("I love my family 90 time");
        System.out.println("I love my family 100 time");
// We don't have any compile time error, but its a runtime error that stops the flow of running our code,
// because we had computer faced an issue and abruptly terminate our program. So, we throw a ( try & catch )
// to avoid this runtime error. Meaning: try my code if its good, if not continue with catch by throwing Exception
// that avoid this and continue the rest of the program or code. So that my other code are protected.



    }
}
