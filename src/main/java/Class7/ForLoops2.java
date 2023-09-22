package Class7;

public class ForLoops2 {
    public static void main(String[] args) {

        // write a code to print 1 2 4 5 7 8 10 11 13 16 17 18
        // This condition divides all the numbers by 3 and checks if the remainder is zero or not: i % 3 != 0

       for(int i=0; i<20; i++){
          if(i % 3 != 0){
              System.out.println(i);
          }
        }
    }
}
