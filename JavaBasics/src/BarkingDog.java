/**
 * Created by @techieasif on February, 2020
 */
public class BarkingDog {
    public static void main(String[] args) {
boolean result = shouldWakeUp(true, -9);
        System.out.println(result);
    }
    public static Boolean shouldWakeUp(Boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23 ) {
            return false;
        }else{
            if(barking == true && hourOfDay < 8){
                return true;
            }else if(barking == false && hourOfDay < 8){
                return false;
            }else if(barking == true && hourOfDay > 22){
                return true;
            }else {
                return false;
            }
        }
    }
}
