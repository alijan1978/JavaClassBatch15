package Class14;

public class ReturnDemoTest {
    public static void main(String[] args) {

        ReturnDemo returnDemo= new ReturnDemo();

        String string = returnDemo.method1();
        System.out.println(string);

        int result = returnDemo.method2();
        System.out.println(result);

    }
}
