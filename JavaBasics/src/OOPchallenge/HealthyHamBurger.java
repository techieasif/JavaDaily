package OOPchallenge;

/**
 * Created by @techieasif on April, 2020
 */
public class HealthyHamBurger extends BaseHamBurger{
    private boolean isCabbage;
    private boolean chips;
    private double cabbagePrice = 2;
    private double chipsPrice = 5;
    HealthyHamBurger(boolean cabbage, boolean chips, boolean isLettuce, boolean isTomato, boolean isCarrot, boolean isOnion){
        super(isLettuce, isTomato, isCarrot, isOnion, "BrownBread");
        this.chips = chips;
        this.isCabbage = cabbage;
    }

    public double getCabbagePrice() {
        return cabbagePrice;
    }

    public double getChipsPrice() {
        return chipsPrice;
    }

    @Override
    public double getTotalPrice() {
        double basePriceHealthyBurger = super.getTotalPrice();
        if(isCabbage)
        {
            basePriceHealthyBurger += getCabbagePrice();
            System.out.println("added: cabbage +" + getCabbagePrice());

        }
        if(chips)
        {
            basePriceHealthyBurger += getChipsPrice();
            System.out.println("added: chips + " + getChipsPrice());

        }

        return basePriceHealthyBurger;
    }
}
