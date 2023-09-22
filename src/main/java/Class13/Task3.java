package Class13;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first names and if they are expecting boy or girl ?
        Based on the Input suggests a name for a baby:
        Example output:
            Mom's first name => Mary
            Dad's first name => Daniel
            Boy or Girl ? => Boy
            Suggested baby name: DANRY (mixture of both parent's name-> takes first have of Dad's name
             and add it to first have of mom's name)
            If the baby is girl => suggested baby name: MAIEL
         */

        String dadsName = "Daniel";
        String momsName = "Mary";
        String expectedBaby = "girl";

        String firstHalfName="";
        String secondHalfName = "";
            if(expectedBaby.equalsIgnoreCase("boy")){

//            String firstHalfName = dadsName.substring(0,3);

            // it gives Dad's first four letter
            // Instead we can use the following to show always the half of the name

            firstHalfName = dadsName.substring(0,dadsName.length() / 2);//from 0 index to half
            secondHalfName = momsName.substring(momsName.length() / 2);//
            // Now combine both half of the names

        }else {
                firstHalfName = momsName.substring(0, momsName.length() / 2);
                    secondHalfName = dadsName.substring(dadsName.length() / 2);
                }

                System.out.println(firstHalfName + secondHalfName);

    }
}
