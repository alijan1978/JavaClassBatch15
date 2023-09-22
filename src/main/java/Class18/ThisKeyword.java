package Class18;

public class ThisKeyword {

    int a,b;

    public ThisKeyword(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void sum(int a,int b){
        System.out.println("Sum of Local Variables = "+(a + b));
        System.out.println("Sum of Instance Variables = "+(this.a+this.b));
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword=new ThisKeyword(10,20);

        thisKeyword.sum(100,200);

    }
}
