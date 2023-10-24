package Class27;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        // Always prefer LinkedList if we want to add or remove elements in between

        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String> futureSubjects = new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("TestNG");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");

        // we want to combine all above two list subjects together into allSubjects

        LinkedList<String> allSubjects = new LinkedList<>();
        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList<String> subjectsILike = new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");
        System.out.println(subjectsILike);
//        allSubjects.removeAll(subjectsILike); // removes everything
//        System.out.println(allSubjects);

    }
}
