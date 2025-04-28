package Array;

public class MissingNumber2 {

        public static void missingNumber(int[] arr){
            int max=arr[0];
            int actualSum=0;
            for(int num:arr){
                if(num>max){
                    max=num;
                }
                actualSum=actualSum+num;
            }
            int expectedSum=max*(max+1)/2;
            int missingNumber=expectedSum-actualSum;
            System.out.println("Missing number is ="+missingNumber);


        }
        public static void main(String[] args) {
            int[] arr=ArrayUtility.inputArray();
            missingNumber(arr);
        }
}


