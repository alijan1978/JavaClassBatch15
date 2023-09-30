package Class24;

public interface Washable{ // instead of class, we write interface
    void wash(); // by default interface method is "public"
}

class SmartWatch implements Washable{
    @Override
     public void wash(){
        System.out.println("I am IP65 rated, you can wash me");}
}

    class Phone implements Washable{

        public void wash(){
            System.out.println("I am IP65 rated, you can wash me");}
    }

    class Inverter implements Washable{

       public void wash(){
            System.out.println("I am IP65 rated, you can wash me");}
    }
