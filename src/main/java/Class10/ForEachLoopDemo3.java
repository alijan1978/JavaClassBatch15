package Class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] array={10,13,20,25,45,50};

        // We cannot update/replace the elements in For Each Loop because we don't have access to the index.
        // We can ONLY read or Print the elements

        for(int box : array){
            if(box % 2 != 0){
                box=0; // We cannot update or replace any elements

            }
        }
    }
}
