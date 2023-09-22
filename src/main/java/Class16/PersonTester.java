package Class16;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
//        System.out.println(person.bankBalance);// We cannot access Private modifier in any other class, any other package
        System.out.println(person.address);
        System.out.println(person.name);
        person.tikTokAccount();// we can access TikTok account
        person.printSSN();// We can access SSN number
        //But phonePassword is not accessible here

    }
}
