package Class19;

public class SportTest {
    public static void main(String[] args) {

        // Below is the Object of child class Cricket
        // with the help of super() , it refers to Parent class constructor and initialize the value

        Cricket cricket = new Cricket("Cricket team", "Pakistan", "Green helmet");

        cricket.display(); // here it prints out the Parent class method

        System.out.println("-----create object of Soccer class----\n");

        Soccer soccer = new Soccer("Soccer", "Argentina", "Oliver's", 12);
        soccer.display(); // shows the Cricket child class
        soccer.displayTeam(); // shows the Soccer child class

        // Class 19 , min 2:57

    }
}
