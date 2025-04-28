package Array;

public class MissingNoInArray {
    public static void missingNumber(int[] arr1,int[] arr2){
        int sum1=0;
        int sum2=0;
        for (int i=0;i<arr1.length;i++){
            sum1=sum1+arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            sum2=sum2+arr2[i];
        }
        System.out.println("Missing Number ="+(sum1-sum2));


    }
    public static void main(String[] args) {
        int[] arr1=ArrayUtility.inputArray();
        int[] arr2=ArrayUtility.inputArray();
        missingNumber(arr1,arr2);
    }
}
