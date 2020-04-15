package composition;

/**
 * Created by @techieasif on April, 2020
 */
public class Monitor {
    private String model;
    private int size;
    private Resolution resolution;
    private String manufacturer;

    public Monitor(String model, int size, Resolution resolution, String manufacturer) {
        this.model = model;
        this.size = size;
        this.resolution = resolution;
        this.manufacturer = manufacturer;
    }

    public void drawPixel(int x, int y){
        System.out.println("Drawing pixels at X: " + x +", " + "Y :" + y);
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
