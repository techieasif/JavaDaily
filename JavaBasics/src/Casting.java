/**
 * Created by @techieasif on January, 2020
 */
public class Casting {
    public static void main(String[] args) {
        //Java uses int by default to perform operations on variable.
        short myShortNumber = Short.MAX_VALUE;//32767
        // short myHalfShortNumber = myShortNumber/2; it will error , to remove this error we need to cast it to short.
        short myHalfShortNumber = (short) (myShortNumber/2);
        System.out.println("Half Short Number: " + myHalfShortNumber);

        int myIntNumber = Integer.MAX_VALUE;
        int myHalfInt = myIntNumber/2; // it will not give error java by default uses integer
        System.out.println("My half Int: "+ myHalfInt);






    }
}
