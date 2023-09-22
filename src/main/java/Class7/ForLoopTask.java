package Class7;

public class ForLoopTask {
    public static void main(String[] args) {

        //Write for loop code to print odd number from 1 to 20

        for (int i=0; i<20; i++){
            if(i %2 !=0){
                System.out.println(i);
            }
        }
        System.out.println("_______________ another example---------------\n");

        for (int i=1; i<20; i+=2){
            System.out.println(i);
        }
    }
}
