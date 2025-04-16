/*
Pair Sum
you have given an array arr consisting of n distinct positive integers arranged
in ascending order and also given an integer target.
your task is count all the distinct pair in arr such that their sum is equal
to target
1=> 1,2,3,4,5  and target=6     ans=>2
2=> 4,6,8,9,11,14 and target=7  ans=>0
*/
package Array;

public class PairSum {
    public static int calculatePairSum(int[] arr,int target){
        if(target <= arr[0]){
            return 0;
        }
        int count=0;
        int sum;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
               sum=arr[i]+arr[j];
               if(sum==target){
                   count++;
               }
            }
        }
        return count;
    }

    public static int effectivePairSum(int[] arr,int target){
        if(target <= arr[0]){
            return 0;
        }
        int count=0;
        int sum;
        int start=0;
        int end=arr.length-1;
        while (start<end){
            sum=arr[start]+arr[end];
            if(sum==target){
                count++;
                start++;
                end--;
            }else if (sum>target){
                end--;
            }else {
                start++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8};
        int target=1;
        System.out.println(effectivePairSum(arr,target));

    }
}
