/**
 * Created by @techieasif on February, 2020
 */

/*
Exercise :
           take  input from user , create a function that returns Positive if input integer greater than 0 and negative if less than 0
           Zero if input equals to 0.
 */


import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner takeIntInput = new Scanner(System.in);
        System.out.println("Enter Value to Check:- ");
        int userInput = takeIntInput.nextInt();
   checkNumber(userInput);
    }
    public  static void checkNumber(int number){
        if(number > 0){
            System.out.println("Positive");
        }else if(number < 0){
            System.out.println("Negative");
        }else{
            System.out.println("zero");
        }
    }
}
