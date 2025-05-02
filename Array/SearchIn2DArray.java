package Array;

import java.util.Scanner;

public class SearchIn2DArray {

    public static boolean isFound(int[][] arr,int num){
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();
        int[][] arr=ArrayUtility.input2DArray();
        if(isFound(arr,num)){
            System.out.println("Number is found in an array");
        }else {
            System.out.println("Number is not found");
        }
    }
}
