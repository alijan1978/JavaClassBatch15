package Class20;

public class Calculator {
        // Overloading lesson

    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    void add(int num1, double num2){
        System.out.println(num1+num2);
    }
        void add(double num2, int num1){
        System.out.println(num1+num2);
    }

    // We can simply change the parameters of another same method. for example, we can add another int value,
    // or we can change the datatype of int to double or whatever. Or we can change the sequence of its parameters.
    // If we have different methods with the same name, its possible if we change its parameters by:
    // changing the number of parameter, datatype of parameter, or sequence of parameter
    // Method overloading means -> to use the same method over and over again just with changing its parameters.
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(10,10);//Java scan multiple option/methods we have, then pass the parameter with int data types
        calculator.add(10.5, 10);
        calculator.add(10, 10.5);

        // Even if there is not a perfect match of the datatype we pass,
        // Java tries to type casting by changing the datatype value. up casting or down casting
        // For example, if there is two int, and we have int and double in our method, java changes one of int values to double
        // to print out.... Not from int to String. it only changes if there is No loss of information. EX: 10 and 10.0 is Same.
    }

}
