/**
 * Created by @techieasif on February, 2020
 */
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500); // 2500 KB = 2MB and 452KB
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kiloBytes/1024;
            int remainingKiloBytes = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + "MB and " + remainingKiloBytes + "KB" );
        }
    }
}
