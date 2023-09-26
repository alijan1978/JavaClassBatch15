package Class23;

public abstract class Phone {
    /*
    Create a Phone Class, create abstract methods of displayPictures, unlockPhone, sendText.
    create 2 child classes, iPhone, Samsung, Google, and provide specific implementation.
    Write code to achieve runtime polymorphism.
     */

    abstract void unlockPhone();
    abstract void sendText();
    abstract void displayPictures();
}

    class iPhone extends Phone{

        @Override
        void unlockPhone() {
            System.out.println("Face ID to unlock the iPhone");}

        @Override
        void sendText() {
            System.out.println("Lets use the iMessage to send the text");}

        @Override
        void displayPictures() {
            System.out.println("iPhotos to browse the pictures");}
    }

        class Samsung extends Phone{

            @Override
            void unlockPhone() {
                System.out.println("Unlock the phone using fingerprint sensor or Camera");}

            @Override
            void sendText() {
                System.out.println("Use the Messages App to send the message");}

            @Override
            void displayPictures() {
                System.out.println("Use the Gallery App to browse the photos");}
        }