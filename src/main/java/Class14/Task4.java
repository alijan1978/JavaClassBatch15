package Class14;

public class Task4 {
    public static void main(String[] args) {

      /* How would you Reverse a String word by word ?
        For example: input => This is sentence I want to revers
        Output => siht si ecnetnes I tnaw ot srever.
       */

//        StringBuilder string =new StringBuilder("This is sentence I want to reverse");
//        System.out.println(string.reverse());
//        String newString = string.toString();

        String string = "This is sentence I want to reverse";
        String[] array = string.split(" ");
//
//        for (String word: array) {
//            for (int i = word.length()-1; i >= 0; i--) {
//                System.out.print(word.charAt(i));
//
//            }
//            System.out.print(" ");
//        }

//        for(String word: array){
//            StringBuilder str = new StringBuilder(word);
//            str.reverse();
//            System.out.print(str);
//            System.out.print(" ");
//        }
            for(String word: array){
                System.out.print(new StringBuilder(word).reverse()+" ");
            }

    }
}
