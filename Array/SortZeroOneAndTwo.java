/* sort zero's and one's and two
you have been given an integer array of size n that contains only 0,1 and 2.
Write a function to sort this array
Think of solution that scan an array only once and doesn't require use of an
extra space
single scan refers to iterating an array just once or to put it in another word
you will be visiting each element in the array just once
1. 0,1,2,2,1,0
=> 0,0,1,1,2,2
*/
package Array;

import java.util.Arrays;

public class SortZeroOneAndTwo {
    public static void sort123(int[] arr){
        int left=0;
        int current=0;
        int right=arr.length-1;
        int temp;
        while (current<=right){
            if(arr[current]==0){
                temp=arr[left];
                arr[left]=arr[current];
                arr[current]=temp;
                left++;
                current++;
            }else if (arr[current]==2){
                temp=arr[right];
                arr[right]=arr[current];
                arr[current]=temp;
                right--;
            }else {
                current++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,2,1,2,1,1,0,0,2};
        sort123(arr);
        System.out.println(Arrays.toString(arr));

    }
}
