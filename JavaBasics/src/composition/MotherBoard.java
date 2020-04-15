package composition;

/**
 * Created by @techieasif on April, 2020
 */
public class MotherBoard {
    private String model;
    private int ramSlots;
    private int cardSlots;
    private String manufacturer;

    public MotherBoard(String model, int ramSlots, int cardSlots, String manufacturer){
        this.cardSlots = cardSlots;
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String programName){
        System.out.println("loading " + programName);
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
