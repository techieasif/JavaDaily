package composition.challenge;

/**
 * Created by @techieasif on April, 2020
 */
public class Land {
    private int landSize;
    private String landLocation;

    public Land(int landSize, String landLocation) {
        this.landSize = landSize;
        this.landLocation = landLocation;
    }

    public void landDetails(){
        System.out.println("Land Size : " + landSize + "and " + "Location : " + landLocation);

    }
    public int getLandSize() {
        return landSize;
    }

    public String getLandLocation() {
        return landLocation;
    }
}
