package Array;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the ele number "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    /*
    public static void main(String[] args) {

        ArrayUtility.displayArray(ArrayUtility.inputArray());

    }

     */
}
