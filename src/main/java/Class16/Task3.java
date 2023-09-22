package Class16;

public class Task3 {
/*
    Create a method that will print whether given String is Palindrome or not ?
    Return type -> void
    method name -> isPalindrome
    parameters -> String inputStr
    Palindrome => any String or Int value if we Reverse it, it's the same. OR it's readable from both sides
    Example: dad , mom, 353, 171
 */
    void isPalindrome(String str){
        StringBuilder string=new StringBuilder(str);
        string.reverse();
        String reversedString = string.toString();
        if(str.equals(reversedString)){
            System.out.println(str+" is Palindrome");
        }else {
            System.out.println(str+" is Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Task3 task3 = new Task3();
//        String result = task3.isPalindrome("Kaya"); // Cannot assign void methods to variables
//        System.out.println(task3.isPalindrome("Kaya")); // cannot use void methods in System.out.println()

        task3.isPalindrome("Kaya");
        task3.isPalindrome("dad");
    }
}
