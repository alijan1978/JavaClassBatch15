package Class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice practice=new MethodPractice();
       boolean isEven= practice.isEven(15);
        System.out.println(isEven);

        boolean isEvenNumber= practice.isEven(100);
        System.out.println(isEvenNumber);

        // we can directly call it, If we don't use the isEven() method else where
        // this is shorter way
        System.out.println(isEvenNumber);
        System.out.println(practice.isEven2(12));



    }
}
