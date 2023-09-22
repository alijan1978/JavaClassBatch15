package Class19;

public class Sport {

    String name;
    String country;

    Sport(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public void display(){
        System.out.println(name+" is mostly played in "+country);
    }
}
// here we create a child class of Cricket

    class Cricket extends Sport{

    String helmet;
    Cricket(String name, String country, String helmet){
        super(name, country) ; // super() is the parent class constructor (or access the parent class)
        this.helmet=helmet; // this keyword, is from the child class object

    }
}
// another child class of Soccer

    class Soccer extends Sport{

    String team;
    int numberOfPlayers;

    Soccer(String name, String country, String team, int numberOfPlayers){
    super(name, country);
    this.team = team;
    this.numberOfPlayers = numberOfPlayers;
    }

    void displayTeam(){
        System.out.println(team+" consist of "+numberOfPlayers+" players");
    }
}