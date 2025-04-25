package Array;

public class ArraySumAvg {
    public static long sum(int[] arr){
        long sum=0;
        for (int ele:arr){
            sum=sum+ele;
        }
        return sum;
    }
    public static double average(int[] arr){
        long sum=sum(arr);
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        long sum=sum(arr);
        double avg=average(arr);
        System.out.println("Sum ="+sum+" Average ="+avg);
    }
}
