package JavaReview11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo1 {
    public static void main(String[] args) {

        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Dragon fruit", 5.6);
        fruitMap.put("Pear", 16.5);
        fruitMap.put("Orange", 15.5);
        fruitMap.put("Mango", 10.6);
        fruitMap.put("Strawberry", 6.5);

        fruitMap.forEach((x,y)-> System.out.println(x+y)); // very new updates instead of For Loop or ForEach Loop to iterate
        fruitMap.forEach((key,value)-> System.out.println(key+" = "+value)); // instead of x and y , we change it to key & value

    // Remove those elements that contains the letter 'a' OR 'e' in their name and the prices are more than $ 8
        // using Lambda expression x->

        fruitMap.entrySet().removeIf(entry-> (entry.getKey().contains("a") || entry.getKey().contains("e")) && entry.getValue()>8);
        System.out.println(fruitMap);



    }
}
