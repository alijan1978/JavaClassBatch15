package JavaReview6;

public class Garden {

    public static void main(String[] args) {

        Flower flower1 =new Flower();

        System.out.println(Flower.pretty); // Static variable always better to be called by Class name

        flower1.name="Hibiscus";
        flower1.color="Red";
        flower1.type="Ground flower";
        flower1.price=5;

//        flower1.pretty=false; // if we change static variable here, it affects in all objects created

        System.out.println(flower1.pretty); // not a good practice to use with object of class

        flower1.smell();
        flower1.bloom();
        flower1.grow();
        System.out.println("Flower's name: "+ flower1.name);
        System.out.println("Flower's color: "+flower1.color);
        System.out.println("Flower's type: "+ flower1.type);
        System.out.println("Flower's price: "+flower1.price);

        System.out.println("----Creating Second Object of the Flower---\n");

        Flower flower2 =new Flower();
        flower2.name="Rose";
        flower2.color="Pink";
        flower2.type="Tree flower";
        flower2.price=15;

        System.out.println(flower2.pretty); // can be accessed among all instances/objects

        flower2.smell();
        flower2.bloom();
        flower2.grow();
        System.out.println("Flower's name: "+ flower2.name);
        System.out.println("Flower's color: "+flower2.color);
        System.out.println("Flower's type: "+ flower2.type);
        System.out.println("Flower's price: "+flower2.price);

        System.out.println("----Creating Third Object of the Flower---\n");

        Flower flower3 =new Flower();
        flower3.name="Jasmine";
        flower3.color="Blue";
        flower3.type="Stress free flower";
        flower3.price=20;

        flower3.smell();
        flower3.bloom();
        flower3.grow();
        System.out.println("Flower's name: "+flower3.name);
        System.out.println("Flower's color: "+flower3.color);
        System.out.println("Flower's type: "+flower3.type);
        System.out.println("Flower's price: "+flower3.price);
    }
}
