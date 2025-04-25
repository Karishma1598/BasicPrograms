package Array;

public class MaxMinOfArray {
    public static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int ele:arr){
            if(ele>max){
                max=ele;
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int ele:arr){
            if(ele<min){
                min=ele;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        System.out.println("Max ="+max(arr));
        System.out.println("Min ="+min(arr));
    }
}
