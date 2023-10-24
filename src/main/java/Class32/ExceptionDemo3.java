package Class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream fileInputStream = new FileInputStream("");
        }catch (FileNotFoundException e){

        }
        // Checked exception:
        // if we hover mouse on FileInputStream Object to add exception or using try & catch block...
        // its mandatory because Java doesn't continue to compile unless you avoid error.
        // But we directly write throws keyword by throwing exception in Method header line
        // so that we leave or throw responsibility of fixing on someone else, not checked

        // Unchecked exceptions:
        // unchecked ar runtime exception which something has gone wrong while Developers programmed it
        // so it cannot be avoided by using try & catch block or throw keyword.
    }
}
