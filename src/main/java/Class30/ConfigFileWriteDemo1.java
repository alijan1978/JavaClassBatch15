package Class30;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo1 {
    public static void main(String[] args) throws IOException {
    /*
    We need the Path where we want to create the new file and the name of the file with its extension
     */
    String path="Files/test.properties";
  // If we create or write data, we use FileOutputStream
    FileOutputStream fileOutputStream=new FileOutputStream(path);

        Properties properties=new Properties();
        properties.setProperty("Name", "Tahseen jan");
        properties.put("Password","pass786"); // we can use put() method as well
        properties.store(fileOutputStream,"Two new things has been added");



    }
}
