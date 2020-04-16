package OOPchallenge;

/**
 * Created by @techieasif on April, 2020
 */
public class Main {

    public static void main(String[] args) {
        HealthyHamBurger healthyHamBurger = new HealthyHamBurger(true, false, true, false, true, true);

        System.out.println("Item Name : " + healthyHamBurger.getBreadRollType() + "\nTotal Price: " + healthyHamBurger.getTotalPrice());

        System.out.println(".........................................................");
        DeluxHamBurger deluxHamBurger = new DeluxHamBurger(true, true);
        System.out.println("Item Name : " + deluxHamBurger.getBreadRollType() + "\nTotal Price: " + deluxHamBurger.getTotalPrice());
    }
}
