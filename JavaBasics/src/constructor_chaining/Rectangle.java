package constructor_chaining;

/**
 * Created by @techieasif on April, 2020
 */


//this is an example of constructor chaining
public class Rectangle {
    private int x ;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public Rectangle(){
        this(0, 0); // calls secondConstructor
    }

    //2nd constructor
    public Rectangle(int width, int height){
        this(0, 0, width, height); // calls third Constructor
    }

    //3rd Constructor
    public Rectangle(int x, int y, int width, int height){
        //initializes variables.
        this.x = x;
        this.height = height;
        this.width = width;
        this.y = y;
    }
}

/**
*in this example we have created 3 constructors but only one called to initializing variables.(3rd)
 * other two constructors just calling next one.
 */