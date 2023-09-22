package Class19;

public class UserClass {
    /*
    Create UserClass that has a constructor that initializes instance variable name and mobile number.
    create a Subclass userInfo that will have user address available and it also being initialized through
    constructor call. Print the user's name, mobile number and address in userDetails method. Test your code
     */
    String name;
    int mobileNumber;

    public UserClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
    class UserInfo extends UserClass{

    String address;

        public UserInfo(String name, int mobileNumber, String address) {
            super(name, mobileNumber);
            this.address = address;
        }

        void userDetails(){
            System.out.println("Name: "+name);
            System.out.println("Mobile Number: "+mobileNumber);
            System.out.println("Address: "+address);
        }

        // Test it in the same class by creating object of child class
        public static void main(String[] args) {
            UserInfo userClass=new UserInfo("Sadeea jan ", 5301235," San Jose, California");

            userClass.userDetails();

            // No methods in Parent class
            // One methods from Child class

            // Important: All classes in Java have a parent class
            // The parent of all the classes are Object class built-in with
            // parameterized or non-argument constructor (in backend scene with the help of super() keyword)
            // It has built-in methods from that invisible Object class that we can use them

            System.out.println("------Initializing Object in other ways-----------\n");

            // you can do it this way as well, below:
            String str = new String();
            str = "Hello";
            // OR we can initialize it through parameter
            String string = new String("Hello ");
            System.out.println(string);
            System.out.println(str);
        }
    }
