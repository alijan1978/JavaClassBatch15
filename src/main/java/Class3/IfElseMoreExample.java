package Class3;

public class IfElseMoreExample {
    public static void main(String[] args) {

        char c='M';

        if(c=='M'){
            System.out.println("It refers to Male");
        }

    String name="Abdullah jan";
        // with non-primitive datatype like String, we cannot use == symbol or Relational operators
        // ... we Only can use method

        if(name.equals("Abdullah jan")){
            System.out.println("He is an Amazing student");
        }
        if(!name.equals("Abdullah jan")){
            System.out.println("He is Super Amazing student");
        }

        boolean hungry=false;
        System.out.println(hungry);
           if(!hungry){
                 System.out.println("Lets eat something");
        }

           int money=1500;

             if(money>300){
                System.out.println("Lets go for shopping");
             }else {
                 System.out.println("Lets save some more money");
           }

    }
}
