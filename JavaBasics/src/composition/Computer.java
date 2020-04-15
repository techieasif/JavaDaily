package composition;

/**
 * Created by @techieasif on April, 2020
 */
public class Computer {
    private CpuCase cpuCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public Computer(CpuCase cpuCase, Monitor monitor, MotherBoard motherBoard) {
        this.cpuCase = cpuCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp() {
        cpuCase.pressPowerButton();
        motherBoard.loadProgram("Windows 1.2");
        monitor.drawPixel(120, 500);
    }

}
