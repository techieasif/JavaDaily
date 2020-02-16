import java.util.Scanner;

/**
 * Created by @techieasif on February, 2020
 */
public class MinMaxChallenge {
    Scanner scanner = new Scanner(System.in);
    int min = 0;
    int max = 0;

    while(true){
        System.out.println("Enter Number ");
        boolean isInt = scanner.hasNextInt();
        int number = scanner.nextInt();
        if(isInt){
            System.out.println(number);
        }else {
            break;
        }
    }

}
