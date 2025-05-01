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
    public static int[][] input2DArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows=sc.nextInt();
        System.out.println("Enter no of columns");
        int col=sc.nextInt();
        int[][] arr=new int[rows][col];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<col;j++){
                System.out.print("Please enter ele  rows "+(i+1)+", Column "+
                        (j+1)+" :");
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void display2Darray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

       // ArrayUtility.displayArray(ArrayUtility.inputArray());
        //ArrayUtility.display2Darray(ArrayUtility.input2DArray());

    }


}
