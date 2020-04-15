package encapsulation;

/**
 * Created by @techieasif on April, 2020
 */
public class Printer {
    private int tonerLevel;
    private boolean isDuplex;
    private int pagesPrinted;

    Printer(int tonerLevel, boolean isDuplex){
        if(tonerLevel >-1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;

    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <=100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this. tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return -1;
        }
    }

    public int PrintPages(int pages) {
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pages/2) + (pages%2);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
