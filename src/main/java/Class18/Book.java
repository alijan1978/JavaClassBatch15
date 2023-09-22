package Class18;

public class Book {
    /*
    Write a Book class that will have Instance variables and 2 Constructors. While creating an object make sure that:
    Instance variables are being initialized, Both constructors are being executed
     */
    String author;
    String title;
    int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    void info(){
        System.out.println("Author is: "+author+" Title is: "+title+" Published year is: "+year);
    }
    public static void main(String[] args) {
        Book book=new Book("James Gosline","Java Book",1995);
        book.info();
    }
}
