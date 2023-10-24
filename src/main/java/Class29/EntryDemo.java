package Class29;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {

        Set<Entry> entrySet=new LinkedHashSet<>();
        entrySet.add(new Entry(1,"Ali"));
        entrySet.add(new Entry(2,"Wajia"));
        entrySet.add(new Entry(3,"Khadija"));
        entrySet.add(new Entry(4,"Sadeea"));
        entrySet.add(new Entry(5,"Abdullah"));
        entrySet.add(new Entry(6,"Zainab"));
        entrySet.add(new Entry(7,"Tahseen"));

        Entry entry = new Entry(1, "Ali");
        System.out.println(entry.getKey()+" "+entry.getValue());

        // Remove those objects for which the value of key is 1
        // if its greater than 2 and value contains letter 'i'
        entrySet.removeIf(x-> x.getKey() >2 && x.getValue().contains("i"));

        System.out.println(entrySet);
    }
}
