package Class10;

import java.util.Arrays;

public class twoDArrays {
    public static void main(String[] args) {

        // Two D Array: array inside array ( nested array )
        // Below is a 2D Array which can hold 3 one D arrays and each of array size is 3

        String [][] familyTrain = new String[3][3];

        String [] cabin0 = {"Abdullah","Tahseen","Zainab"};
        String [] cabin1 = {"Khajoo","Sadoo","Wajoo"};
        String [] cabin2 = {"Ali","Baaba","Mama"};

        familyTrain[0] = cabin0;
        familyTrain[1] = cabin1;
        familyTrain[2] = cabin2;

        // The first [] specify the address of 1 D Array

        System.out.println(familyTrain[1][2]); //from Cabin 1 , look for index 2 (Wajoo)
        System.out.println(familyTrain[2][1]);// from cabin 2, look for index 1 (Baaba)

        // We can print all one day Array. For example all indexes of cabin 1 , 2, 3
        System.out.println(Arrays.toString(familyTrain[1]));
        System.out.println(Arrays.toString(familyTrain[2]));
        System.out.println(Arrays.toString(familyTrain[0]));
    }
}
