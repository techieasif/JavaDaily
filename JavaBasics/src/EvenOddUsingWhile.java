/**
 * Created by @techieasif on February, 2020
 */
public class EvenOddUsingWhile {

    public static void main(String[] args) {
        runWhile(2, 20);

    }

    public static void runWhile(int num, int endNum) {
        int count = 0;

        while (num != endNum) {
            num++;
//            System.out.println("value of num " + num);
            if (!evenOdd(num)) {
                continue;
            }
            count++;
            System.out.println(num + " is Even");
            if(count == 5 ){
                break;
            }
        }
        System.out.println("Total even number found : "+count);
    }

    public static boolean evenOdd(int number) {
        if (number <= 0) {
            return false;
        }
        if ((number % 2 == 0)) {
            return true;
        }
        return false;
    }
}
