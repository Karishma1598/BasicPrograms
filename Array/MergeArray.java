package Array;

public class MergeArray {
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int newSize=arr1.length+arr2.length;
        int[] newArray=new int[newSize];
        int i=0,j=0,k=0;
        while (i<arr1.length||j<arr2.length){
            if(j==arr2.length || (i<arr1.length&&arr1[i]<arr2[j])){
                newArray[k]=arr1[i];
                i++;
                k++;
            }else {
                newArray[k]=arr2[j];
                j++;
                k++;
            }

        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr1=ArrayUtility.inputArray();
        int[] arr2=ArrayUtility.inputArray();
        int[] mergeArray=mergeArray(arr1,arr2);
        ArrayUtility.displayArray(mergeArray);
    }
}
