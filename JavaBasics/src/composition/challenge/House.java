package composition.challenge;

/**
 * Created by @techieasif on April, 2020
 */

//Building House using Composition of Classes.
public class House {
    private Furniture furniture;
    private Kitchen kitchen;
    private Room room;
    private Land land;

    public House(Furniture furniture, Kitchen kitchen, Room room, Land land) {
        this.furniture = furniture;
        this.kitchen = kitchen;
        this.room = room;
        this.land = land;
    }

    public void houseDetails(){
        furniture.furnitureDetails();
        kitchen.kitchenDetails();
        room.roomDetails();
        land.landDetails();
    }

}
