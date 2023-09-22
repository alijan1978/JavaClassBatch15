package Class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country = "Afghanistan";

        System.out.println(country.toLowerCase()); // changes/converts it to lower case
        switch (country.toLowerCase()){

            case "usa":
                System.out.println("In-N-OUt Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");


        }


    }
}
