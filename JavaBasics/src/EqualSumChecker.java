/**
 * Created by @techieasif on February, 2020
 */
public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(3,5,8));
    }
    public static boolean hasEqualSum(int number1, int number2, int number3){
        if(number1+number2 == number3){
            return true;
        }else{
            return false;
        }
    }
}
