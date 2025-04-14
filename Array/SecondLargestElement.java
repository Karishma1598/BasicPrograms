package Array;

/*
second largest in an array
you have been given a random integer array(arr) of size N,you have requested
to find and return second largest ele in a present array
Note: if N<=1 or all ele of an arrays are same then return integers min value
i.e -2^31
==> 2,13,4,1,3,6,28 ans=>13
==> 9,3,6,2,9 ans=>6
==> 6,6,6,6,6,6 ans=> -2^31
*/

import java.util.Arrays;

public class SecondLargestElement {

//time complexity = o(n)
    public static int findSecondLargest(int[] arr){
        int max,secMax;
        max=secMax=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                secMax=max;
                max=x;
            }else{
                if(x>secMax && x!=max){
                    secMax=x;
                }
            }
        }


        return secMax;
    }

    /*
    time complexity = o(n log n)
    public static int findSecondLargest(int[] arr){
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                return arr[i-1];
            }
        }
        return Integer.MIN_VALUE;

    }

     */



    public static void main(String[] args) {
        int[] arr={11,22,4,5,23,55,2,28};
        System.out.println(findSecondLargest(arr));
    }
}
