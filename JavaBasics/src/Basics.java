import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        Scanner takeInput = new Scanner(System.in);
        System.out.println("Please enter Your Name \r");
        String name = takeInput.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Please Enter an Integer to calculate its Square :\n");
        int number = takeInput.nextInt();
        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println("Number entered by " +name+" is "+number);
        System.out.println("\nSquare of "+number +" is " + (number*number));
        System.out.println("Choose an option to calculate more operation on "+number+" 1. cube\t 2. 60% of it");
        int choice = takeInput.nextInt();

        if(choice==1){
            System.out.println("Cube of "+number+" is " +(number*number*number));
            return;
        }else if(choice == 2){
            System.out.println("60% of "+number+" is " +(number*0.60));
            return;
        }else{
            System.out.println("Choose Valid operation ");
            return;
        }



    }
}
