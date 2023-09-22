package Class12;

public class Task6 {
    public static void main(String[] args) {

        /*
        Create 2D Array of countries: North America countries and South America countries, European countries,
        Asian countries, African countries.
        Then print all values from that Array using 2 different loops and Calculate how many total countries are stored.
         */

        String[][] countries = {
                {"USA","Canada","Mexico"},
                {"Brazil", "Argentina","Peru","Colombia","Chile"},
                {"Germany","UK","France","Neitherland","Spain"},
                {"Egypt","Nigeria","South Africa","Ethiopia"},
                {"China","Japan","Korea","Afghanistan","Pakistan","India"}
        };

        int counter=0;
        System.out.println("-----Using Normal For Loop -----------\n");

        for (int i = 0; i <countries.length; i++) { // HOw many Arrays
            for (int j = 0; j < countries[i].length; j++) {//What are the sizes of these Arrays
                System.out.print(countries[i][j]+"  "); // to print all the countries , in one line
                counter ++; // every time it prints the country will count it
            }
            System.out.println();
        }
        System.out.println("Total countries existed in this Array are:  "+counter);

        System.out.println("-----------Using Enhanced For Loop-----------\n");

        for(String[] country : countries){
            for(String names : country){
                System.out.print(names+"  ");
                counter ++;
            }
            System.out.println();
        }



    }
}
