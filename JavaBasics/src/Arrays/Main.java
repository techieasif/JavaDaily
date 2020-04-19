package Arrays;

import java.util.Scanner;

/**
 * Created by @techieasif on April, 2020
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter length : \r");
        int length = scanner.nextInt();
        int[] myInteger = getInteger(length);
        System.out.println("Entered Values :");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < myInteger.length; i++) {
            System.out.println("Element " + i + ", " + "Entered value " + myInteger[i]);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Average :  |" + getAvg(myInteger) + "|");
        System.out.println("----------------------------------------------");
    }

    public static int[] getInteger(int number) {
        int[] arr = new int[number];
        System.out.println("Enter " + number + " integer Values \r");
        for (int a = 0; a < number; a++) {
            arr[a] = scanner.nextInt();
        }
        return arr;
    }

    public static double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / (double) arr.length;
    }
}
