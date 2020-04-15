package encapsulation;

/**
 * Created by @techieasif on April, 2020
 */
public class Main {

    //Encapsulation is a very good practice to follow in OOP languages.
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("initial Pages : " + printer.getPagesPrinted());
        int pagesToPrint = printer.PrintPages(5);
        System.out.println("Pages to print : " + pagesToPrint + " Total Printed Pages " + printer.getPagesPrinted());

    }
}
