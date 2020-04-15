package reference;

/**
 * Created by @techieasif on April, 2020
 */
public class House {
    private String color;

    House(String color){
        this.color = color;
    }



    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }


    //main function
    public  static  void main (String args[]){
        House house = new House("Red");

        //anotherHouse referenced to old house object.
        House anotherHouse = house;
        System.out.println("House -> " + house.getColor()); //red
        System.out.println("AnotherHouse -> " + anotherHouse.getColor()); //red

        //setting blue color using anotherHouse
        anotherHouse.setColor("Blue");
        System.out.println("House -> " + house.getColor());
        System.out.println("AnotherHouse -> " + anotherHouse.getColor());


        //one more example - white house

        House whiteHouse = new House("White"); // new separate object than house
        anotherHouse = whiteHouse; //referencing whiteHouse.
        System.out.println("House -> " + house.getColor());//blue
        System.out.println("WhitHouse -> " + whiteHouse.getColor());//white
        System.out.println("AnotherHouse -> " + anotherHouse.getColor()); //white




    }


}
