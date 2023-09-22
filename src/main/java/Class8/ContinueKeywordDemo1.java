package Class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // Continue: works like Skip, when it reaches the condition given, it skips everything
            // Continue is like Break should always be with if condition

            // we can write like this as well: if(i == 3)
            // also we can write: if( i == 3 || i == 6 || i == 9) we tell Java to skip 3 6 9

            if(i % 3 == 0){ // we tell java to skip 3 and continue iteration the rest
                continue;
            }else {
                System.out.println(i);
            }
        }
        System.out.println("-----------another way ----------------\n");

        for (int i = 0; i < 10; i++) {

            if(i == 3 || i == 6 || i == 9){ // skips 3 , 6, 9
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
