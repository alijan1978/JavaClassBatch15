package Class23;

public abstract class File {
    /*
    Create a class of File that will have the following behaviors: open, edit, close. Edit and close are implemented
    methods while open is an abstract. Create 3 Subclasses of JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behavior. Example: To open .java file, we  need notepad++ or subline text. To open .doc file,
    we need Microsoft Word to be installed.
     */
    int size;
    File(int size){
        this.size=size;
    }

    abstract void open();

    void edit(){
        System.out.println("Editing the file");
    }
    void close(){
        System.out.println("Closing the file");
    }
}
// The child class will have error extending abstract parent class. either child class be abstract too, or to override the method
    class JavaFile extends File{

    JavaFile(int size){
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in Intellij");
    }

    @Override
    void edit() {
        System.out.println("Editing the file in Intellij");
    }
}

    class WordFile extends File{

    WordFile(int size){
        super(size);
    }

        @Override
        void open() {
            System.out.println("openning the file in Microsoft Word");
        }
    }

    class PDFFile extends File{

    PDFFile (int size){
        super(size);
    }
        @Override
        void open() {
            System.out.println("Opening the file in Adobe Reader");
        }
    }
