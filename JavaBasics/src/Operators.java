/**
 * Created by @techieasif on January, 2020
 */
public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);


//=> Shorthand operators
        int x;

        x = 7;
        x += 4; // equivalent  to x = x+4;
        System.out.println("Addition Assignment "+x);

        x = 7;
        x -= 4;
        System.out.println("Subtraction Assignment "+x);

        x = 7;
        x *= 4;
        System.out.println("Multiplication Assignment "+x);

        x = 7;
        x /= 4;
        System.out.println("Division Assignment "+x);

        x = 7;
        x %= 4;
        System.out.println("Modulus of Remainder Assignment "+x);


//-> Increment Decrement Operators:
        /*
        ++ -> Increment operator (increments value by 1)
        -- -> Decrement operator (Decrements value by 2)
         */
        int num1 = 10;
        System.out.println("Value of Num1 before increment operator "+num1);
        num1++;
        System.out.println("Value of Num1 after increment operator "+num1);

        //decrement
         num1 = 20;
        System.out.println("Value of Num1 before decrement operator "+num1);//20
        num1--;
        System.out.println("Value of Num1 after decrement operator "+num1);//19

//for more details refer to source : http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/04/shorthand.html


    }
}
