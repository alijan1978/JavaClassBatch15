package Class28;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        Horse horse=new Horse("Jacky", "Persian", 12);

        ArrayList<Horse> horses=new ArrayList<>();
        horses.add(new Horse("Jacky", "Persian", 12));
        horses.add(new Horse("Jami ", "German", 15));
        horses.add(new Horse("Jimmi", "BullHorse", 10));
        horses.add(new Horse("Mami", "Unknown", 6));

        for(Horse h : horses){
            h.printHorseName();
        }
    }
}
