/**
 * Created by @techieasif on February, 2020
 */
public class DigitSumChallenge {

    public static void main(String[] args) {
    int num = 2345;
        int sum = getSum(num);
        if(sum == -1){
            System.out.println("Invalid Value Provided");
            return;             //terminate
        }
        System.out.println("Sum of digits in "+num+" number " + sum);
    }

    public static int getSum(int num){

        int sum = 0;
        int temp = 0;
        if(num < 10){
            return -1 ;
        }
        while (num != 0){
            temp = num%10;
            num /=10;
            sum +=temp;
        }
        return sum;

    }
}
