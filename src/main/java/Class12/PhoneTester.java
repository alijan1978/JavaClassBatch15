package Class12;

public class PhoneTester {
    public static void main(String[] args) {

    Phone iPhone = new Phone();
    iPhone.brand="iPhone";
    iPhone.color="White";
    iPhone.price=1100;
    iPhone.version=14;
    iPhone.storage=256.5;
    iPhone.isUnlocked=true;

        System.out.println(iPhone.brand);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
        System.out.println(iPhone.version);
        System.out.println(iPhone.storage);
        System.out.println(iPhone.isUnlocked);
        iPhone.ringing();
        iPhone.sendingMessages();
        iPhone.calling();
        iPhone.usingGPS();
        iPhone.playingGames();
        iPhone.sendReceiveEmails();

        System.out.println("------------Create another object of the Phone-----------\n");

        Phone samsung = new Phone();
        samsung.brand="Samsung";
        samsung.color="Silver";
        samsung.price=1000;
        samsung.version=15;
        samsung.storage=126.5;
        samsung.isUnlocked=false;

        samsung.ringing();
        samsung.sendingMessages();
        samsung.calling();
        samsung.usingGPS();
        samsung.playingGames();
        samsung.sendReceiveEmails();

        System.out.println(samsung.brand);
        System.out.println(samsung.color);
        System.out.println(samsung.price);
        System.out.println(samsung.version);
        System.out.println(samsung.storage);
        System.out.println(samsung.isUnlocked);
    }
}
