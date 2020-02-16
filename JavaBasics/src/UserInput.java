import java.util.Scanner;

/**
 * Created by @techieasif on February, 2020
 * to handle User Input From Console Java Provided Us a class Called Scanner which needs to be imported
 */



public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name:  ");
        boolean hasString = scanner.hasNextInt(); // checks next input is number or not.
        if(!hasString){
            String name = scanner.nextLine();
            // scanner.nextLine(); -> handles next line(enter press)
            System.out.println("Enter Your Birth year : ");
            boolean hasNumber = scanner.hasNextInt(); //validation next input should be a number else show error
            if(hasNumber){
                int birthYear = scanner.nextInt();
                int age = 2020 - birthYear;
                if(age >=0 && age <=100){
                    System.out.println("Your Name is  " + name + " and you are " + age + " years old.");

                }else{
                    System.out.println("Unable to parse birth year");
                }
            }else {
                System.out.println("Enter Valid birth year@ i.e numbers not alphabets ");
            }

        }else {
            System.out.println("Please Enter Valid Name");
        }
scanner.close();
    }
}
