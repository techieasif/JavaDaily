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
            
//-> Floating Point Primitives : =>  Float and Double
        System.out.println("----- F L O A T ------");
        float myFloatMinValue = Float.MIN_VALUE; //-32768
        float myFloatMaxValue = Float.MAX_VALUE; // 32767
        System.out.println("Float Min Value : "+ (myFloatMinValue));//-9223372036854775808
        System.out.println("Float Max Value : "+ (myFloatMaxValue));

        /*Note:->
            float myNumber = 6.87; -> will give you error, as java uses double by default for
            floating point literals, to define float you need to either add `L` or explicitly cast
            it to float.
            lets see an example: float errorFloat = 6.87; //error : required float, found double.
         */
        //ways to solve this error;
        float errorFloat = 6.87F;//way1
        float errorFloat2 = (float) 6.87;
        System.out.println("errorFloat way1: "+ errorFloat);
        System.out.println("errorFloat way2: "+ errorFloat2);

//-> double Floating Point Primitive:
        /* double is used as default data type for any decimal point literal
            -> It is faster than float.
            -> It is more accurate than float.
         */
        System.out.println("------ D O U B L E -------");
        double myDoubleNumber = 5;//5.0
        double myDoubleNumberWithAlphabet = 5d; //5.0
        double myDoublePrecisionNumber = 5.00;//5.0

        System.out.println("myDoubleNumber:" +myDoubleNumber);
        System.out.println("myDoubleNumberWithAlphabet "+myDoubleNumberWithAlphabet);
        System.out.println("myDoublePrecisionNumber " + myDoublePrecisionNumber);

        //checking accuracy as compared to float.
        float floatDivision = 5/3; //1.0 inaccurate
        float floatDivisionRight = 5f/3f;//1.6666666 float accurate but not exactly accurate
        System.out.println("floatDivision :"+floatDivision);
        System.out.println("floatDivisionRight: "+floatDivisionRight);

        double doubleDivision = 5/3;//1.0 inaccurate, warning :- integer Division in floating context.
        System.out.println("doubleDivision: " + doubleDivision);

        double doubleAccurateDivision = 5d/3d;//1.6666666666666667 accurate
        System.out.println("doubleAccurateDivision: " + doubleAccurateDivision);

        double anotherWayOfWriting = 576634_8.7684223_8464d;//5766348.768422385 correct
        System.out.println("anotherWayOfWriting : " +anotherWayOfWriting);

//Quick use of floating precision lets create small program":
        /*program to convert pound to Kilograms;
        1 pound => 0.45359237 kilogram
         */
        double pound1EquivalentToKg = 0.45359237d;
        double myPounds = 87d;
        double resultKg = myPounds*pound1EquivalentToKg; //39.46253619
        System.out.println("Given Pound " + myPounds +" is equivalent in KG's  : " + resultKg);




//-> char primitive
        /*
        it can hold only one character or unicode characters.
        Size of Byte is 16 bit -> width 16 and 2byte.

         */
        char myChar = 'D';//D
        System.out.println("myCar : "+myChar);

//-> Boolean primitive
        /*
        It can hold only either true or false.
         */

        boolean isTrueBool = true;
        boolean isFalseBool = false;
        System.out.println("isTrueBool : "+ isTrueBool);
        System.out.println("isFalseBool : "+ isFalseBool);

    }
}
