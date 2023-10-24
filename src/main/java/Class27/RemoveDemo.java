package Class27;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        // After Java 10, with the help of "var" we don't need to specify the Data type
        // With Java 9, it doesn't work

        var name="Abdullah jan";
        var c='s';
        var f=12.5;

        // Iterator and while loop operation was from 6 and works until Java 19

//        Iterator<String> iterator=words.iterator();
//
//        while (iterator.hasNext()){
//            String  s = iterator.next();
//            if(s.endsWith("a")){
//                iterator.remove();
//            }
//        }

        // After Java 8 ... so doesn't work with Java 7

        words.removeIf(s -> s.endsWith(("a"))); // Lambda expression by default understands the data type, No need to write
        System.out.println(words);
    }
}
