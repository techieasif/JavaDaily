package OOPchallenge;

/**
 * Created by @techieasif on April, 2020
 */
public class DeluxHamBurger extends BaseHamBurger {
    private boolean isChips;
    private boolean isDrinks;
    private double chipsPrice = 10d;
    private double drinkPrice = 50d;
    DeluxHamBurger(boolean isChips, boolean isDrinks){
        super(false, false,false, false, "White Bread");
        this.isChips = isChips;
        this.isDrinks = isDrinks;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    @Override
    public double getTotalPrice() {
        double deluxHamBurgerTotalPrice =  super.getTotalPrice();

        if(isDrinks){
            deluxHamBurgerTotalPrice += getDrinkPrice();
            System.out.println("added: Drinks + " + getDrinkPrice());
        }

        if(isChips){
            deluxHamBurgerTotalPrice += getChipsPrice();
            System.out.println("added : chips + " + getChipsPrice() );
        }
        return deluxHamBurgerTotalPrice;
    }
}
