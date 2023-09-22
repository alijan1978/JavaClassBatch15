package Class15;

public class Task1 {
    /*
    Create a method createEmail()...Based on values of user's Name, lastName, and email type.
    YOur method should return complete email address. Example: createEmail(John, Snow, gmail) so it should make it as
    johnsnow@gmail.com ....
    Return type -> String
    method name -> createEmail
    parameter -> String firstName, String lastName, String emailType
    { concat }
     */
    String createEmail(String firstName,  String lastName,String emailType ){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        Task1 info = new Task1();
        System.out.println(info.createEmail("Sadeea","Ali","gmail"));
    }


}
