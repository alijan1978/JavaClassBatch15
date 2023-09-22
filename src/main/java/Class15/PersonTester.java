package Class15;

import Class16.Person;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
//        System.out.println(person.bankBalance);// Private cannot access Private modifier in any other class, any other package
//        System.out.println(person.address); // Default Cannot be accessed in different package
        System.out.println(person.name);

        person.tikTokAccount();// ONLY we can access TikTok account because its public
//        person.printSSN();// We cannot access SSN number in different package.
        //But phonePassword is not accessible here


    }
}
