package Class32;

public class ExceptionDemo2 {
    public static void main(String[] args) {

    String name = "Tahseen";

    if(name.length() < 9){

//        throw new RuntimeException("This is my son's name");
//        throw new NullPointerException("This is Baby Tahseen");
        throw new SmartException("Tahseen is very Smart boy"); // We created SmartException class for my own exception


    }


    }
}
