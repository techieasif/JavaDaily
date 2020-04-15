package composition;

/**
 * Created by @techieasif on April, 2020
 */
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(15, 18, 10);
        CpuCase cpuCase = new CpuCase("HP HyBride", "Hp", "240V", dimensions);
        Monitor monitor = new Monitor("Samsung Wide", 22, new Resolution(22, 20), "samsung");
        MotherBoard motherBoard = new MotherBoard("Gigabyte 211", 2, 2, "GigaBit");

        Computer computer = new Computer(cpuCase,monitor,motherBoard);
       computer.powerUp();
    }
}
