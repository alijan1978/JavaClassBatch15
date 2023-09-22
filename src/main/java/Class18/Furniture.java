package Class18;

public class Furniture {

    String type;
    double price;
    String color;

    // With the help of constructor, we can initialize (give value) object with specific value.
    public Furniture(String type, double price, String color) {
        this.type = type;
        this.price = price;
        this.color = color;
    }
    void print(){
        System.out.println(type+" Sofa Arm chair "+"Price is "+1200+color+ " Biege & white");
    }
    public static void main(String[] args) {

        Furniture furniture=new Furniture("Sofa Arm chair",1200, " Biege & white");
        furniture.print();

//        System.out.println(furniture.type);
//        System.out.println(furniture.price);
//        System.out.println(furniture.color);

    }
}
