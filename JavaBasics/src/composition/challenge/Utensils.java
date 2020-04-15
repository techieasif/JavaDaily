package composition.challenge;

/**
 * Created by @techieasif on April, 2020
 */
public class Utensils {
    private int noOfUtensils;
    private int utensilsType;

    public Utensils(int noOfUtensils, int utensilsType) {
        this.noOfUtensils = noOfUtensils;
        this.utensilsType = utensilsType;
    }

    public void utensilDetails(){
        System.out.println("No of Utensils in the Kitchen : " + noOfUtensils);
        System.out.println("Having Utensil type: " + utensilsType);
    }

    public int getNoOfUtensils() {
        return noOfUtensils;
    }

    public int getUtensilsType() {
        return utensilsType;
    }
}
