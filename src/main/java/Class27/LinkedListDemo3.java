package Class27;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        LinkedList<String> numbers = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(0,"Test Data");
            System.out.println(i);
        }


    }
}
