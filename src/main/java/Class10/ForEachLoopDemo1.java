package Class10;

public class ForEachLoopDemo1 {
    public static void main(String[] args) {

        String [] namesOfKids = {"Khadija", "Sadeea","Abdullah","Zainab","Tahseen"};

        //Using For Each Loop/Enhanced Loop

        for(String name : namesOfKids) {
        //It is simplified, store all array names of Kids into variable "name" and then print it.

            System.out.println(name);

        }

    }
}
