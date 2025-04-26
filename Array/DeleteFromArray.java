package Array;

import java.util.Scanner;

public class DeleteFromArray {
    public static int[] deleteFromArray(int[] arr,int num){
        int occ=OccuranceArray.noOfOccurance(arr, num);
        int size=arr.length-occ;
        if(occ==0)
            return arr;
        int[] newArr=new int[size];
        for (int i=0,j=0;i<arr.length;i++){
            if(arr[i]!=num){
                newArr[j]=arr[i];
                j++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=ArrayUtility.inputArray();
        System.out.println("Enter the number you want to delete");
        int num=sc.nextInt();
        int[] newArray=deleteFromArray(arr,num);
        ArrayUtility.displayArray(newArray);

    }
}
