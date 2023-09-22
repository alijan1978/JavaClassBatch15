package Class13;

import javax.sound.midi.Soundbank;

public class ReplaceAllMethods {
    public static void main(String[] args) {

   String string = "KKLSDKjksope;d%%433789**KKK@#!!kjsdf!!$$(())";

   // All upper case letter should be changed to #
        System.out.println(string.replaceAll("[A-Z]","#"));

        // All lower case letter should be changed to "< >";
        System.out.println(string.replaceAll("[a-z]","< >"));

        // all numbers should be replaced to "0" zero
        System.out.println(string.replaceAll("[0-9]","0"));

        //Now we can replace both upper case and lower case letter to "@" sign
        System.out.println(string.replaceAll("[A-Za-z]","@"));

        // Replace uppercase, lowercase and numbers to "#"
        System.out.println(string.replaceAll("[A-Za-z0-9]","#"));

    //using Caret Symbol ' ^ ' from Regular Expression inside bracket which means Not, to JUST replace special characters
        System.out.println(string.replaceAll("[^ A-Za-z0-9]","#"));
        System.out.println(string.replaceAll("[^ A-Za-z0-9]","")); // No replacement.

    }
}

// Class 13, time 1:30 speed 2x