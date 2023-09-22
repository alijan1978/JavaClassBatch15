package Class12;

public class StringDemo10 {
    public static void main(String[] args) {

        String string = "Java is not pain";

        System.out.println(string.indexOf("a")); // it can tell us the index of the letter
        // Input is char .... output is number
        System.out.println("not");
        System.out.println("p");

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i)+ " has the index of:    "+ i);//shows all index numbers of string letters

        }
    }
}
