package composition.challenge;

/**
 * Created by @techieasif on April, 2020
 */
public class Kitchen {
    private Utensils utensils;
    private String kitchenColor;
    private GasStove gasStove;

    public Kitchen(Utensils utensils, String kitchenColor, GasStove gasStove) {
        this.utensils = utensils;
        this.kitchenColor = kitchenColor;
        this.gasStove = gasStove;
    }
public void kitchenDetails(){
    System.out.println("Kitchen Color : " + kitchenColor);
    utensils.utensilDetails();
    gasStove.gasStoveDetails();

}
    public Utensils getUtensils() {
        return utensils;
    }

    public String getKitchenColor() {
        return kitchenColor;
    }

    public GasStove getGasStove() {
        return gasStove;
    }
}
