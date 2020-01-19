/**
 * Created by @techieasif on January, 2020
 */

/*-> Exploring String DataType its an actually a class of which used to define strings in java.
        According to Documentation: -
The String class represents character strings. All string literals in Java programs, such as "abc", are implemented as instances of this class.
Strings are constant; their values cannot be changed after they are created.
String buffers support mutable strings.
Because String objects are immutable they can be shared.
For example:
       String str = "abc";

is equivalent to:
       char data[] = {'a', 'b', 'c'};
       String str = new String(data);

Here are some more examples of how strings can be used:
       System.out.println("abc");
       String cde = "cde";
       System.out.println("abc" + cde);
       String c = "abc".substring(2,3);
       String d = cde.substring(1, 2);
 */
public class Str {
    public static void main(String[] args) {


        String myString  = "This is a String in java ";
        System.out.println("my String :" +myString);


//concatenation OR Appending->
        String str1 = "This is strring one";
        String str2 = " this is String two";

        System.out.println("Result of Concatenation : =>\t" + str1+str2);

        //It can also be concatenated with variables :
        String str3 = str1+str2;
        System.out.println(str3);


        //un initialized String gives you null value;
        String nullString ;
//        System.out.println("nullString -> :" + nullString); -> gives error : java: variable nullString might not have been initialized


//while appending strings with int, double , float or long, java reads them as text and append their values with strings.
        //example:
        int appendIntWithString = 56;
        System.out.println("Integer Appended with String :=> " +str1+appendIntWithString);//This is string one56


//TODO : add more Content to StrClass in future.





    }
}
