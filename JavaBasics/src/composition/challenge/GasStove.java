package composition.challenge;

/**
 * Created by @techieasif on April, 2020
 */
public class GasStove {
    private String manufacturer;
    private int noOfFlamePots;

    public GasStove(String manufacturer, int noOfFlamePots) {
        this.manufacturer = manufacturer;
        this.noOfFlamePots = noOfFlamePots;
    }

    public void gasStoveDetails(){
        System.out.println("Manufacturer : " + manufacturer + " having no of flame pits : " + noOfFlamePots);
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public int getNoOfFlamePots() {
        return noOfFlamePots;
    }
}
