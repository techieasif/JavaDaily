import java.util.Scanner;

/**
 * Created by @techieasif on February, 2020
 */
public class UserInputExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i<=10; i++){
            System.out.println("Enter " + i + " Number ");
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                sum = sum +number;
            }else {
                System.out.println(i + " Input is not valid hence discarded");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of Entered Numbers is : " + sum);
        scanner.close();
    }
}
