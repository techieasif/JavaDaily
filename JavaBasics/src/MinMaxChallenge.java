import java.util.Scanner;

/**
 * Created by @techieasif on February, 2020
 */

public class MinMaxChallenge {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int min = 0; //way 1
//        int max = 0; // way1
//        boolean firstInput = true; //way1 - using flag of first input
//way to using min max value of data type.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter Number ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
//            if(firstInput){   //using flag of first run.
//                firstInput = false;
//                min = number;
//                max = number;
//            }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                System.out.println("Invalid Input Exit ...");
                break;
            }
        }
        System.out.println("Min = " + min + " , Max = " + max);
        scanner.close();
    }

}
