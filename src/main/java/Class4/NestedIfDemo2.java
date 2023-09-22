package Class4;

public class NestedIfDemo2 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=120000;

        if(studyHard){
            System.out.println("We get the jobs");
            // Java will execute the first condition, then the rest. if true prints out the desired output

            if(salary>100000){
                System.out.println("Les buy a Tesla");
            }else {
                System.out.println("Lets buy a Toyota");
            }

        }else {
            System.out.println("It might take longer for us to get the jobs");
        }



    }
}
