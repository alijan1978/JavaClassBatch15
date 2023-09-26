package Class23;

//public final class Test {} if we create a class as final.... no class can inherit it or child class can override
public class FinalKeywordDemo {
    public static void main(String[] args) {

//        final int num = 10; // once the value is declared final, no change is possible
      final int num; // we created a constant variable
      num = 10;
//      num = 20; // Not possible to change, because the variable is declared final

    }

    final void noOneShouldOverride(){ // We cannot override a final method as well

        System.out.println("This method should never be Overridden");
    }
}
    class Test extends FinalKeywordDemo{
//        @Override
//        void noOneShouldOverride() {
//            super.noOneShouldOverride();
//            System.out.println("Let me try to Override the above Method");

    }

