package Class18;

public class Monkey {


    String name;
    int age;
    double weight;

    Monkey(String monkName, int monkAge, double monkWeight){
        this.name=monkName;
        this.age=monkAge;
        // this keyword -> refers to the current object.
        // it can be used with variables and methods.
        // this keyword refers to the instance variables. In situation when local variable
        // have the same name as object/instance, then we use "this keyword" to differentiate
        // and refer to the instance/object variable.
    }

//    Monkey(){
//        System.out.println("This is non argument constructor");
//    }

    void print(){
        System.out.println("Monkey's name is  "+name+" and age is "+age+" and weight is "+weight);
    }

}
