package JavaReview11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {

        // rename -> refactor or Shift + F6
        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Dragon fruit", 5.6);
        fruitMap.put("Pear", 16.5);
        fruitMap.put("Orange", 15.5);
        fruitMap.put("Mango", 10.6);
        fruitMap.put("Strawberry", 6.5);

    // print only those elements that contains the letter 'a' OR 'e' in their name and the prices are more than $ 8

        var entrySet=fruitMap.entrySet();
        for(var entry : entrySet){
            String key=entry.getKey();
           if((key.contains("a") || key.contains("e")) && entry.getValue() > 8){ // we should separate elements by parenthesis ( ) PEMDAS math operation
               System.out.println(entry);
           }
    }
    }
}
