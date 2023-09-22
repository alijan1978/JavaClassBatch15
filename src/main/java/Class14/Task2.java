package Class14;

public class Task2 {
    public static void main(String[] args) {

        /* Create a String that should be combination of letters, numbers, and special characters.
        Find out how many Alphanumeric (abd AZ 284) characters are there in the String.
         */
        String string = "asdfjklASDFJKLPQI^%$^$%^%$OWEURZXCV02934560-32SD!@$%^&*^&*( );nmxcvweu";

        System.out.println(string.replaceAll("[^A-Za-z0-9]","").length());
    }
}
