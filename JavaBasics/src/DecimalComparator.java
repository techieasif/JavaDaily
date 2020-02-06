/**
 * Created by @techieasif on February, 2020
 */
public class DecimalComparator {
    //program to check values are equal upto 3 decimal places.

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.9865, 3.9868);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        a = a * 1000;

        b = b * 1000;

        int a1 = (int) a;

        int b1 = (int) b;

        if (a1 == b1) {
            return true;
        } else
            return false;
    }
}
