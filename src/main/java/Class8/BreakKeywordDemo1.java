package Class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        // We can achieve the same result without break keyword as well, see Demo 2

        boolean summer = true;
        int temperature = 75;

        while (summer){

            if(temperature <= 100){
                System.out.println("I love going out on summer because the temperature is "+temperature);
            }else {
                System.out.println("The weather is very hot if temperature reaches "+temperature);
                break;
            }
            temperature += 5;
        }



    }
}
