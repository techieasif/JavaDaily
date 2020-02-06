/**
 * Created by @techieasif on February, 2020
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 1800;
        boolean result = isLeapYear(year);
        System.out.println(year + " is Leap Year -> "+result);
    }
    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
