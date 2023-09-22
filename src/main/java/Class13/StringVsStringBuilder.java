package Class13;

public class StringVsStringBuilder {
    public static void main(String[] args) {


        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 1000; i++) {

            string.append(i);

        }
        System.out.println();



    }
}
