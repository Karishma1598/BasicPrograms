package Array;

import java.util.Scanner;

public class OccuranceArray {
    public static int noOfOccurance(int[] arr,int num){
        int occ=0;
        for(int ele:arr){
            if(ele==num)
                occ++;
        }
        return occ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=ArrayUtility.inputArray();
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();
        System.out.println("No of Occurance :"+noOfOccurance(arr,num));
    }
}
