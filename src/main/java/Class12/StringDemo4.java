package Class12;

public class StringDemo4 {
    public static void main(String[] args) {

        String string = "My name is Ali ";
        System.out.println(string.isEmpty()); // since String is not empty,

        //Another way
        boolean isEmpty = string.isEmpty();
        System.out.println(isEmpty);

        // another way
        System.out.println(string.isBlank()); // isBlank() doesn't count the space, BUT isEmpty even counts space


    }
}
