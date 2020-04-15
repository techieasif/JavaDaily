package composition.challenge;

/**
 * Created by @techieasif on April, 2020
 */
public class Furniture {
    private int noOfSofas;
    private int noOfTables;
    private String furnitureColor;
    private String manufacturer;

    public Furniture(int noOfSofas, int noOfTables, String furnitureColor, String manufacturer) {
        this.noOfSofas = noOfSofas;
        this.noOfTables = noOfTables;
        this.furnitureColor = furnitureColor;
        this.manufacturer = manufacturer;
    }

    public void furnitureDetails(){
        System.out.println("No of Sofas : " + noOfSofas);
        System.out.println("no of Tables : " + noOfTables);
        System.out.println("Furniture color " + furnitureColor);
        System.out.println("manufactured by " + manufacturer);
    }

    public int getNoOfSofas() {
        return noOfSofas;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public String getFurnitureColor() {
        return furnitureColor;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
