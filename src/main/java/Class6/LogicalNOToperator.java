package Class6;

public class LogicalNOToperator {
    public static void main(String[] args) {

        System.out.println(false);
        System.out.println( ! false); // makes it true

        boolean condition = ! true; // makes it false
        System.out.println(condition);

        String password = "Abdullahjan";
        if( ! password.equals("Password123")){ // Means: if my password is not "Password123", print wrong password
            System.out.println("You have entered Wrong Password");
        }

        boolean isRaining   = true;
        if(!isRaining){
            System.out.println("Lets for a walk now");
        }else {
            System.out.println("We should take our umbrella");
        }
    }
}
