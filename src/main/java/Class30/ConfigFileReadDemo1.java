package Class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {

    // The below is the location or path of the file from which we want to read the data
        String path="Files/config.properties";
// Below is "FileInputStream" Class that helps us Navigate to that folder where file is stored
// For the issues of Red underline on FileInputStream object, Hover your mouse and click " add exception to method signature"
        FileInputStream fileInputStream=new FileInputStream(path);
// This below "Properties" Class will assist us to read and write data to ( .properties files)
        Properties properties=new Properties();
// Load() method, loads all the data from the file inside the above object 'properties'
        properties.load(fileInputStream);
// By calling properties object name with the help of get() method, we provide the Object key of our information
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));
// When we are done with reading data from our file, its better to close it
        fileInputStream.close();



    }
}
