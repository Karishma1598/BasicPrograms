package Array;

public class ReverseArray {
    public static void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;

        }

    }
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        reverse(arr);
        System.out.println("Reverse array is");
        ArrayUtility.displayArray(arr);

    }
}
