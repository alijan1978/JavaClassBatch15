package Class16;

public class Task7 {
    /*
    Create a method that will accept an Array as parameters and will return a sum of all elements from that Array.
    Method should have visibility within the same package and accessible by creating an Instance/Object of the class
     */
    int sumArrayElements(int[] array){

        int sum = 0;
        for(int number : array){
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {

        Task7 task7=new Task7();
        int[] array= {10,25,35,45};
        System.out.println(task7.sumArrayElements(array));

    }

}
