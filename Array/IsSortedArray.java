package Array;

public class IsSortedArray {
    public static boolean isIncreasingSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return true;
    }

    public static boolean isDecreasingSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        boolean isInc=isIncreasingSorted(arr);
        boolean isDec=isDecreasingSorted(arr);
        if(isInc || isDec)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}
