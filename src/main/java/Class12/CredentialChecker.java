package Class12;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CredentialChecker {
    public static void main(String[] args) {

        /*
        Store username, password and confirm from a user and check the following requriements:
        Username and Password cannot be empty, if so -> message = "Username or Password cannot be empty".
        Password should be minimum of 8 characters, if less -> message = "Password is too short".
        Password cannot contain username, if so -> message = "Password cannot contain username".
        Password should match the confirmed password, if not -> message = "Password do not match".

        ONLY after all requirements met --> message "You username and password has been created".
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        String userName=scanner.next();
        System.out.println("Please enter your password");
        String password = scanner.next();
        System.out.println("Please enter your password again");
        String confirmPassword = scanner.next();

        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password cannot be Empty");
        }else if(password.length() < 8){
            System.out.println("Password is too short");
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain user name");
        } else if (! password.equals(confirmPassword)) {
            System.out.println("Password do not match");
        }else {
            System.out.println("Your username and password has been created successfully");
        }
    }
}
