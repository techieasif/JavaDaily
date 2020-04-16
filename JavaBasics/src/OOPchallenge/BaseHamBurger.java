package OOPchallenge;

/**
 * Created by @techieasif on April, 2020
 */
public class BaseHamBurger extends Burger {
    private String breadRollType = "WhiteBread";
    private boolean isMeat;
    private boolean isLettuce;
    private boolean isTomato;
    private boolean isCarrot;
    private boolean isOnion;
    private double baseHamPrice = 100d;
    private double lettucePrice = 40d;
    private double tomatoPrice = 1d;
    private double carrotPrice = 2d;
    private double onionPrice = 1d;


    public BaseHamBurger(boolean isLettuce, boolean isTomato, boolean isCarrot, boolean isOnion, String breadType) {
        this.breadRollType = breadType;
        this.isMeat = true;
        this.isLettuce = isLettuce;
        this.isTomato = isTomato;
        this.isCarrot = isCarrot;
        this.isOnion = isOnion;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getBaseHamPrice() {
        return baseHamPrice;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotPrice() {
        return carrotPrice;
    }

    public double getOnionPrice() {
        return onionPrice;
    }

    public double getTotalPrice() {
        double totalPrice = getBaseHamPrice();
        System.out.println("Base Price :" + totalPrice);
        System.out.println("---------------------------------------------");
        if (isLettuce){
            totalPrice += getBaseHamPrice();
            System.out.println("added: Lettuce + " + getLettucePrice());
        }
        if (isCarrot){
            totalPrice += getCarrotPrice();
            System.out.println("added: Carrot + " + getCarrotPrice());
        }

        if (isOnion)
        {
            totalPrice += getCarrotPrice();
            System.out.println("added: Carrot + " + getCarrotPrice());
        }
        if (isTomato){

            totalPrice += getOnionPrice();
            System.out.println("added: onion + " + getOnionPrice());
        }
        return totalPrice;
    }
}
