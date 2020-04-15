package composition.challenge;

import composition.*;

/**
 * Created by @techieasif on April, 2020
 */

//Building House using Composition of Classes.
public class Main {
    public static void main(String[] args) {
        Furniture furniture = new Furniture(2, 3, "blue", "vardhman");
        Utensils utensils = new Utensils(50, 2);
        GasStove gasStove = new GasStove("Flames", 3);
        Kitchen kitchen = new Kitchen(utensils, "Red", gasStove);
        Dimensions dimensions = new Dimensions(45, 40, 60);
        CpuCase cpuCase = new CpuCase("iBall200", "hp", "240v", dimensions);
        Resolution resolution = new Resolution(20, 43);
        Monitor monitor = new Monitor("2019", 45, resolution, "Hp");
        MotherBoard motherBoard = new MotherBoard("GigaBit", 2, 4, "Asus");
        Computer computer = new Computer(cpuCase, monitor, motherBoard);
        Room room = new Room(400, computer, "Asif");
        Land land = new Land(500, "Mumbai");
        House thHouse = new House(furniture, kitchen, room, land);


        //shows all the house details.
        thHouse.houseDetails();
    }


}
