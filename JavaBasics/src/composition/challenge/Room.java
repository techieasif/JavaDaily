package composition.challenge;

import composition.Computer;

/**
 * Created by @techieasif on April, 2020
 */
public class Room {
    private int roomSize;
    private Computer roomComputer;
    private String whoseRoom;

    public Room(int roomSize, Computer roomComputer, String whoseRoom) {
        this.roomSize = roomSize;
        this.roomComputer = roomComputer;
        this.whoseRoom = whoseRoom;
    }


    public void roomDetails(){
        System.out.println("Room Size : " + roomSize );
        System.out.println("Room Owner : " + whoseRoom );
        System.out.println("Room Having Computer : ");
        roomComputer.powerUp();
    }
    public int getRoomSize() {
        return roomSize;
    }

    public Computer getRoomComputer() {
        return roomComputer;
    }

    public String getWhoseRoom() {
        return whoseRoom;
    }
}
