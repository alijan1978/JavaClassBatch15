package Class12;

public class StringDemo3 {
    public static void main(String[] args) {

        String firstName="Mohammad Ali";
        String lastName="Naim";

        System.out.println(firstName+" "+lastName);
        // also like this:
        String fullName = firstName+" "+lastName;// Mostly used
        System.out.println(fullName);
        // Also through String Concat methods
        System.out.println(firstName.concat(" "+lastName));



    }
}
