/* sort zero's and one's
you have been given an integer array of size n that contains only 0 and 1.
Write a function to sort this array
Think of solution that scan an array only once and doesn't require use of an
extra space
1. 0,1,0,1,0,0,0,1,1,1,0,1
=> 0,0,0,0,0,0,1,1,1,1,1,1
*/
package Array;

import java.util.Arrays;

public class SortZerosOnes {
    public static void sortZeroOnes(int[] arr){
        int left=0;
        int right=arr.length -1;
        while (left<right){
            if(arr[left]==1){
                if(arr[right]!=1){
                    //arr[left]=arr[right];
                    //arr[right]=1;
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                }
                right--;
            }else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,0,0,1};
        sortZeroOnes(arr);
        System.out.println(Arrays.toString(arr));

    }
}
