package Class14;

public class ArrayAddMachine {
    public static void main(String[] args) {

        int [] array = {10,20,30,40,50};
        addArrayElementsMachine(array);

        int [] array2 = {20,30,50,80,90};
        addArrayElementsMachine(array2);
    }
// First we create a Method so that we can use it later

static void addArrayElementsMachine(int[] arr){
        int sum = 0;
        for(int number: arr){
            sum += number;
        }
    System.out.println(sum);

    }
}
