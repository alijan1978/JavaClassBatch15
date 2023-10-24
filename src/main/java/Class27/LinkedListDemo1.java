package Class27;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("Zainab jan");
        linkedList.add("Tahseen jan");
        linkedList.add("Sadeea jan");
        linkedList.add("Khadija jan");
        linkedList.add("Abdullah jan");
        linkedList.add("Wajoo jan");
        System.out.println(linkedList);

        for(String link : linkedList){
            System.out.println(link);
        }


    }
}
