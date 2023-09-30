package Class24;

public class MovableTester {
    public static void main(String[] args) {

        Washable [] washables = {new SmartWatch(),new Inverter(),new Phone()};

        for(Washable w : washables){
            w.wash();
        }

        System.out.println("----- for Movalbe interface---\n");

        Movable [] movables = { new Car(),new Dog(),};

        for(Movable m : movables){
            m.move();

        }



    }
}
