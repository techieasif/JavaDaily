/**
 * Created by @techieasif on February, 2020
 */
public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            return -1;
        }
        return Math.round(kilometersPerHour/1.6902);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/hr = " + result + " mi/hr");
        }
    }
}
