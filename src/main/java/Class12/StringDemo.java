package Class12;

public class StringDemo {
    public static void main(String[] args) {

        //creating object of String class

        String object = new String("Java Programming Language");
        // Another way creating object of String class
        String object2="Java Language";

        System.out.println(object2.length()); // shows how many characters are ( Java Language )

        String fruit = "Banana";
        int words = fruit.length(); // To store the variable of fruit into variable type of INT to show the characters
        System.out.println(words);

        String name = "Mohammad Ali"; // when some website required length of name or password
        if(name.length()>15){
            System.out.println("Name cannot be more than 10 letters");
        }


    }
}
