package Class22;

public class FinalKeyword {

    // Below are final variables
    final double gravity = 9.8;
    final double PI = 3.14;
    final double speedOfLight = 299792458;

    // also we can have a final method
    final void tryChangingGravity(){
//        gravity = 1.6; // we cannot access, get error because this variable is marked as Final.
    }
    final void changingPI(){
//        pi = 4.2; //  same thing, we get error because its marked as Final
    }
}

    class Child extends FinalKeyword{
//        void tryChangingGravity(){
////            gravity = 1.6; // It cannot be inherited by another class, also not able to change it. its marked as Final.
//  }

    }
