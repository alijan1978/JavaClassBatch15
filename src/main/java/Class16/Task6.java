package Class16;

public class Task6 {
    /*
    Create a class of Student that will have a method getGrade. Your method should accept the score of students as below:
    score > 90 = A
    score > 80 = B
    score > 70 = C
    score > 50 = D
    anything else = F
     */
    String getGrade (int Score){
        if(Score >=90){
            return "A";
        } else if (Score >= 80) {
            return "B";
        } else if (Score >= 70) {
            return "C";
        } else if (Score >= 50) {
            return "D";
        }else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        System.out.println(task6.getGrade(70));
    }
}
