import org.w3c.dom.ls.LSOutput;

/**
 * Created by @techieasif on April, 2020
 */
public class StaticVariable {
    public static String dogName;

   public StaticVariable(String name){
        StaticVariable.dogName = name;
    }

    public  void printName(){
        System.out.println("Entered Name : " + dogName);
    }

    public static void main(String[] args) {

        StaticVariable obj1 = new StaticVariable("GermanShepard");
        StaticVariable obj2 = new StaticVariable("BullDog");
        obj1.printName(); //BullDog
        obj2.printName();//BullDog


        //Note: Keep in mined Static variable shares memory across class instances.
        //see both object printing same value.

    }
}
