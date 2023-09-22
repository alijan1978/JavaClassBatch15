package Class20;

public class Programming {

    Programming(){
        System.out.println("I love programming");
    }
    Programming(String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        Programming programming=new Programming();
        // we can also use just the constructor part instead of whole
        // but if we want to call a method with the object name variable, then we need the whole
        new Programming("Java");
    }
}
