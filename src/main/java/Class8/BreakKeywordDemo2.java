package Class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {

        int temperature = 75;

        while (temperature <= 105){

            if(temperature <= 100){
                System.out.println("I love going out on summer because the temperature is "+temperature);
            }else {
                System.out.println("The weather is very hot if temperature reaches "+temperature);
            }
            temperature += 5;
        }
    }
}
