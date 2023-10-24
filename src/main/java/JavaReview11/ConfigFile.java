package JavaReview11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {

 // to connect with our file, we should Navigate to the file path location.
        String path = "Files/config.properties";

 // Whenever we want to read the data from our file, we should use FileInputStream

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Properties properties = new Properties(); // Properties Class assist us to read/write our data .properties files
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("user"));

        } catch (FileNotFoundException e) {
            System.out.println("Something gone wrong");
        }catch (NullPointerException e){
            System.out.println("You are trying to call a method on Null Object");
        }catch (IOException e){
            System.out.println("IO Exception occurred");
        }
    }
}
