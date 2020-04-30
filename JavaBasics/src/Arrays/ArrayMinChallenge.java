package Arrays;

import java.util.Scanner;

public class ArrayMinChallenge {
    static Scanner scanner = new Scanner(System.in);

    public  static int[] getArray(){
        System.out.println("Please Enter Size of List :");
        int num = scanner.nextInt();
        int[] userArray = new int[num];
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Enter Integer Items to The list : ");
        for(int i = 0; i<num; i++){
            userArray[i]= scanner.nextInt();
        }
        return userArray;
    }

    public static int minElement(int[] arr){
        int min = arr[0];
        for(int item = 0; item < arr.length; item++){
            if(arr[item] < min){
                min = arr[item];
            }
        }
        return min;
    }
    public static void showArray(int[] arr){
        System.out.println("Entered Array is : " );
        for(int i =0 ; i< arr.length; i++){
            System.out.println("Index:" + i +",  Element "+arr[i]);
        }
    }
    public static void main(String[] args) {
int[] enteredArray = getArray();
        showArray(enteredArray);
        System.out.println("Minimum Element Found is : " + minElement(enteredArray));
    }
}
