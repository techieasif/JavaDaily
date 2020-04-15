package composition;

/**
 * Created by @techieasif on April, 2020
 */
public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
