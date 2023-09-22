package Class15;

import org.w3c.dom.ls.LSOutput;

public class MethodPractice {

    // Create a method which returns true or false. Take the Int numbers as a parameter if number is even,
    //it should return true otherwise it returns false

    boolean isEven(int number) {
        boolean flag;
        if (number % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
// Another Way
    boolean isEven1(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

//Another way
    boolean isEven2(int number) {
        return number % 2 == 0;


    }
}