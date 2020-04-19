package Arrays;

import java.util.Scanner;

/**
 * Created by @techieasif on April, 2020
 */
public class ArrayChallengeSortingDesc {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter How Many numbers You want to Short in Descending Order : \r");
        int length = scanner.nextInt();
        int[] enteredArray = getArray(length);
        int [] sortedArray = sortedArray(enteredArray);
        printArray(enteredArray, sortedArray);

    }

    public static int[] getArray(int number){
        int[] enteredArray = new  int[number];
        for (int i= 0 ; i<number; i++){
            enteredArray[i] = scanner.nextInt();
        }
        return enteredArray;
    }

    public static int[] sortedArray(int[] arr){
        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public  static void printArray(int[] unSortedArray, int[] sortedArray){
        System.out.println("Unsorted Array : ");
        System.out.println("-----------------------------------------");
        for (int i =0; i<unSortedArray.length; i++){
            System.out.println("Element : " + unSortedArray[i]);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Sorted Array : ");
        System.out.println("-----------------------------------------");
        for (int i =0; i<sortedArray.length; i++){
            System.out.println("Element : " + sortedArray[i]);
        }

        System.out.println("Sorted Successfully! Thank you");

    }
}
