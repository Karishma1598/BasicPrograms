package Array;

public class SumOfDiagonalElement {
    public static int sumOfDiagonals(int[][] arr){
        int leftSum=sumOfLeftDiagonals(arr);
        int rightSum=sumOfRightDiagonals(arr);
        int sum=leftSum+rightSum;
        if(arr.length%2!=0){
            int index=arr.length/2;
            sum=sum-arr[index][index];
        }

        return sum;
    }
    public static int sumOfLeftDiagonals(int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][i];
        }
        return sum;
    }
    public static int sumOfRightDiagonals(int[][] arr){
        int sum=0;
        for (int i=0;i< arr.length;i++){
            int col=arr.length-1-i;
            sum=sum+arr[i][col];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr=ArrayUtility.input2DArray();
        System.out.println("Sum ="+sumOfDiagonals(arr));
    }
}
