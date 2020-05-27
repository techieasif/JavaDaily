package PatternPrograms;

import java.util.Scanner;
import java.io.*;


public class PatternStar {

    public static void printPattern(int num) {
        int i, j;

        for (i = 0; i < num; i++) {
//			System.out.print(" ");

            for (j = 0; j <= i; j++) {
//                if(j%2 == 1){
//                    System.out.println("X");
//                    continue;
//                }
                System.out.print("$ ");

            }
            System.out.println();
        }
    }

    public static void main(String[] Args) {
			Scanner scanInput = new Scanner(System.in);
			System.out.println("Enter number of rows you want print Pattern: ");
			int num = scanInput.nextInt();
			scanInput.nextLine();
        printPattern(num);
    }

}