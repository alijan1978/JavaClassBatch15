package Class5;

public class LogicalOperator2 {
    public static void main(String[] args) {

        //If the score is all subjects are greater than 90 , print Brilliant Student
        // otherwise, if scores are less than 90, print You Need to Work Hard

        // && will print true if all conditions are true, but there is one false not all, it prints false
        // That's why, it holds the flexibility... therefore it's better to have Nested If condition here
        //Because with Nested If, we can customize our condition

        double mathScore=80.5;
        double historyScore=91.5;
        double scienceScore=93.5;

//        if(mathScore > 90 && historyScore >90 && scienceScore >90){
//            System.out.println("You are a Brilliant Student");
//        }else {
//            System.out.println("You need to work hard");
//        }

        if(mathScore>90){
            if(historyScore>90){
                if(scienceScore>90){
                    System.out.println("You are Brilliant Student of this college");
                }else {
                    System.out.println("You need to spend more time to study hard");
                }
            }else {
                System.out.println("You need to spend more time to study harder");
            }
        }else {
            System.out.println("You need to spend more time to study and study more with Math");
        }

    }
}
