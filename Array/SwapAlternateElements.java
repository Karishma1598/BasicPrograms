/*
you have been given an array of size N. You need to swap every pair of alternate
elements in the array/list. You don't need to print or return anything,
just change in the input array itself.
*/

package Array;

public class SwapAlternateElements {

    public static void swapAlternate(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77};
        System.out.println("Before swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        swapAlternate(arr);
        System.out.println("After swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
