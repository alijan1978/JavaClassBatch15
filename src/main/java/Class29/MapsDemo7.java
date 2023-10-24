package Class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsDemo7 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Ali");
        studentsMap.put(2,"Wajia");
        studentsMap.put(3,"Khadija");
        studentsMap.put(4,"Sadeea");
        studentsMap.put(5,"Abdullah");
        studentsMap.put(6,"Zainab");
        studentsMap.put(7,"Tahseen");

        Set<Entry<Integer,String>> entrySet=studentsMap.entrySet();

        for(Entry<Integer,String> entry : entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
//  Remove the entries if key is greater than 2 and value contains the letter i

        entrySet.removeIf(x-> x.getKey()>2 && x.getValue().contains("i")); // Ali, Wajia are not removed coz value was not greater than 2
        System.out.println(studentsMap);

    }
}
