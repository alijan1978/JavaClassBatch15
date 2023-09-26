package Class23;

public class PhoneTester {
    public static void main(String[] args) {

        Phone [] phones = {new Samsung(), new iPhone()};

        for(Phone po : phones){
            po.unlockPhone();
            po.sendText();
            po.displayPictures();
        }


    }
}
