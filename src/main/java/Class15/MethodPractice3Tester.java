package Class15;

public class MethodPractice3Tester {
    public static void main(String[] args) {

        MethodPractice3 practice3=new MethodPractice3();
        int [] array ={10,20,30,40,};
        System.out.println(practice3.arraySum(array));

        System.out.println("--------Directly using here-----");
        System.out.println(practice3.arraySum(new int[]{10,20,30}));
    }
}
