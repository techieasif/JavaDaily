package ArrayListConcepts.autoboxing;

import java.util.ArrayList;

public class AutoBoxing {
    //ArrayList does not support primitive types. It needs classes to work with.
    //Due to which autoboxing and unboxing come into picture.
    //these 2 concepts helps us to work with primitive types inside arraylist.

    public static void main(String[] args) {
            //Array works well with arrays but not with arraylist.
        //lets recap array first.
        int[] myIntArray = new int[20]; //myInt array of size 20;
        String[] myStringArray = new String[20]; //myString array of size 20;
        ArrayList<String> myStringArrayList = new ArrayList<String>(); // created myStringArrayList of type String.
        //above String Arraylist will work since String is a class not primitive type.
        //ArrayList<int> myIntArrayList = new ArrayList<int>(); throws error `argument cannot be of type primitive`.

        /*There are two ways we can work with arraylist using primitive :

            1. Create custom class which accepts primitive type as their instance member.
            2. we can use autoboxing and unboxing concepts provided by java.

        */
        //1. created custom MyInt class, I did for int but can also be done for other primitive types.
        ArrayList<MyInt> myIntCustomClassArrayList = new ArrayList<MyInt>();
        myIntCustomClassArrayList.add(new MyInt(23)); // 23 to arrayList of type MyInt.
        System.out.println(myIntCustomClassArrayList.get(0).getValue());

        //2. using Autoboxing and Unboxing.
        ArrayList<Integer> myAutoBoxedIntArrayList = new ArrayList<Integer>(); //Integer class is provided to work with int.
        //similarly there are equivalent classes present in java example Double for double.
        myAutoBoxedIntArrayList.add(Integer.valueOf(45)); //autoboxed or you can say wrapped.
        myAutoBoxedIntArrayList.add(45);//shortcut java will automatically add Integer.valueOf()

        //retrieving value
        myAutoBoxedIntArrayList.get(0).intValue();//value of index 0 i.e 45, unboxed back or unwrapped.
        myAutoBoxedIntArrayList.get(0); //shortcut java will automatically add intValue function.

    }
}
class MyInt{
    private  int value;

    public MyInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}