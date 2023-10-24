package JavaReview6;

public class StringMethod2 {
    public static void main(String[] args) {

        String myString = "Today is February 2";
        String[] strArray= myString.split(" ");
   // split() method splits this String around matches of given regular expression (regex)

        for(String s : strArray){
            System.out.println(s);
        }
        System.out.println("--------------------------------" );

        System.out.println(myString);//Today is February 2

        String newStr=myString.substring(9);//substring() method accepts int value coz of index
        // substring() gives the value we pick based on its index
        System.out.println(newStr);

        newStr=myString.substring(9, 17);
        System.out.println(newStr);// give me just 'February'

        int indexOf = newStr.indexOf('b'); // give me index of b from 'February'
        System.out.println("Index of character b is: "+indexOf);

        String anotherStr="Today is Thursday";
        indexOf=anotherStr.indexOf("Thursday"); // give me what is the index of word starting 'Thursday'
        System.out.println("Index of Thursday is: "+indexOf);
    }
}
