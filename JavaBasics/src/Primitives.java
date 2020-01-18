/* Exploring Primitive Data Types in Java.
Created by @techieasif january, 2020
 */

public class Primitives {
    public static void main(String[] args) {
//-> Int
int myIntMinValue = Integer.MIN_VALUE;
int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: "+myIntMinValue); //-2147483648
        System.out.println("Integer Maximum Value: "+myIntMaxValue); //2147483647
        /* NOTE:
         -> Memory takes = 32 bit and has a width of 32

        If we try to add value to maximum int value or subtract from int min value.
        Max value will overflow and min value will underflow.
        example: Integer Maximum Value  is = 2147483647 lets add 1 to it at runTime;
        System.out.println(myIntMaxValue+1) -> -2147483648 (overflowed)
        System.out.println(myIntMinValue-1) -> -2147483648 (overflowed)
         */
        System.out.println("Overflowed: "+ (myIntMaxValue+1));
        System.out.println("UnderFlowed: " + (myIntMinValue-1));

        //Integer value can be written in two ways :
        int way1 = 12345734;
        int way2 = 123_457_34; // valid from jdk 7 onwards
        System.out.println("Way1: "+way1); // 2147483648
        System.out.println("Way2: "+way2); // 2147483648

//-> byte primitive

        byte myByteMinValue = Byte.MIN_VALUE; //-128
        byte myByteMaxValue = Byte.MAX_VALUE; // 127
        System.out.println("Byte Min Value : "+ (myByteMinValue));
        System.out.println("Byte Max Value : "+ (myByteMaxValue));
/* NOTE:->
         -> Memory takes = 8 bit and has a width of 8
        Overflow and Underflow Concept is not applicable in byte,short
         because byte operation converted into int type by JVM at run time.
         example :  myByteMaxValue+1 = 128;
                    myByteMinValue-1 = -129;
 */

//-> sort primitive
       // -> Memory takes = 16 bit and has a width of 16
        short myShortMinValue = Short.MIN_VALUE; //-32768
        short myShortMaxValue = Short.MAX_VALUE; // 32767
        System.out.println("Short Min Value : "+ (myShortMinValue));
        System.out.println("Short Max Value : "+ (myShortMaxValue));

//-> long primitive
        /*-> Memory takes = 64 bit and has a width of 64
        -> Overflow Underflow Concept Applies to long also.
        * to assign long value to a variable add `L` at last position
        example => long num = 100L;
         */
        long myLongMinValue = Long.MIN_VALUE; //-32768
        long myLongMaxValue = Long.MAX_VALUE; // 32767
        System.out.println("Long Min Value : "+ (myLongMinValue));//-9223372036854775808
        System.out.println("Long Max Value : "+ (myLongMaxValue));//9223372036854775807



            //Example using above primitives : -
            byte myByte = 125;
            short myShort = 7279;
            int myInt = 56839;
            long myLong = 50000L;

            System.out.println("Result : "+((myByte*10)+(myShort*10)+(myInt*10)+(myLong)));
    }
}
