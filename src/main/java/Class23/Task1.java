package Class23;

public class Task1 {
    /*
    Create a Class of Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some the methods in Child classes.
    Define some methods specific to Child class
    Create objects of child classes and store them into Array. Loop through each object and execute available methods.
     */
}
    class Computer{

        int RAM;
        int Storage;
        String OS;

        void playVideo(){
            System.out.println("Video is playing");}

        void browseInternet(){
            System.out.println("Browse the internet");}
    }

        class Apple extends Computer{

            @Override
            void playVideo() {
                System.out.println("Playing the video on Quick Time player");}

            @Override
            void browseInternet() {
                System.out.println("Browsing the internet using Safari");}

            void installApp(){
                System.out.println("Installing the aps from App Store");}

            void editVideos(){
                System.out.println("Edit videos on iMovies");}
        }

        class HP extends Computer {

            @Override
            void playVideo() {
                System.out.println("Browsing internet using Chrome");}

            @Override
            void browseInternet() {
                System.out.println("Playing video using VLC player");}

            void installApps() {
                System.out.println("You can install any App on me");
            }


            public static void main(String[] args) {

                Computer[] allComputers = {new Apple(), new HP()};

                for(Computer c : allComputers){
                    c.playVideo();
                    c.browseInternet();

                System.out.println("----Accessing the Child Class method--------\n");

          // Important: if we want to access the Child class methods (not override).
          // We should use type casting, by down casting the variable of parent class c to Child class variable of apple
          // We just included the Apple child class, Not the HP child class

                    if(c instanceof Apple) { // we check if the variable c contains the object of an Apple class
                        Apple apple = (Apple) c; // Converting the variable c back to an apple object
                        apple.installApp(); // from Apple child class
                        apple.editVideos(); // from Apple child class
                        apple.browseInternet(); // even we can access the parent class methods
                        apple.playVideo();

                    }
                }
            }
        }

