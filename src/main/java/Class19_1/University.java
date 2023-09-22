package Class19_1;

import Class19.JavaTeacher;

public class University {
    public static void main(String[] args) {

        JavaTeacher javaTeacher=new JavaTeacher();

        javaTeacher.homework(); // accessible because its Public modifier
//      javaTeacher.grade; // protected modifier not available in other packages, except in inheritance
//        javaTeacher.scholarship();// default is not visible in different package too
//        javaTeacher.extraPoint(); // Private is not visiable at all in other classes or packages

        System.out.println("------- Protected Access Modifier can be accessed through Inheritance --------\n");
    }
}
