package JavaReview8;

public class InsuranceTest {
    public static void main(String[] args) {

      // We cannot create object of abstract class of Insurance

      Insurance carPolicy=new CarPolicy("IO84743", "Khadija Ali", 200, 20);
      carPolicy.getInsurance();
      System.out.println(carPolicy.calculateCoverage());;

      Insurance petPolicy=new PetPolicy("iu1232423", "Doggy", 20, 5);

        petPolicy.calculateCoverage();
        System.out.println(petPolicy.calculateCoverage());

      Insurance [] insurances={
              new CarPolicy("IO84743", "Khadija Ali", 200, 17),
              new CarPolicy("IO84743", "Abdullah Ali", 100, 13),
              new PetPolicy("iu1232423", "Doggy", 10, 4),
              new CarPolicy("IO84743", "Sadeea Ali", 150, 16),
      };

        System.out.println(insurances[0].calculateCoverage());
        System.out.println(insurances[1].calculateCoverage());
        System.out.println(insurances[2].calculateCoverage());
        System.out.println(insurances[3].calculateCoverage());

    }
}
