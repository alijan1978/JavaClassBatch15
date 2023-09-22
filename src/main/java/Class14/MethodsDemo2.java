package Class14;

import org.w3c.dom.ls.LSOutput;

public class MethodsDemo2 {

    // Here we just created a method
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("----Now we use another way-----\n");
    }

    void printHelloManyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello Beautiful World");
        }
        System.out.println("----Customizing Method-----\n");
    }

    void printManyTimes(int times,String word){
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }


}
