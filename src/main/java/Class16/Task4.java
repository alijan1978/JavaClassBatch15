package Class16;

public class Task4 {
         // Create a method that will say Hello in different languages based on the country that
         //   will be passed when method is executed.
        // Return type -> String or void
        // method name -> your choice name , sayHello
        // parameter -> String countryName

        String sayHello(String countryName){
            switch (countryName){
                case "USA":
                    return "Hello";
                case "Kazakhstan":
                    return "Salem";
                case "Italy":
                    return "Ciao";
                case "China":
                    return "Ni hao";
                default:
                    return "Country is not support";
            }
        }
        public static void main(String[] args) {
        Task4 task4 = new Task4();
            System.out.println(task4.sayHello("Italy"));
    }
}
