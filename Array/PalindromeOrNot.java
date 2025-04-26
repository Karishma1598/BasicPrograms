package Array;

public class PalindromeOrNot {
    public static boolean isPalindrome(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        if(isPalindrome(arr)){
            System.out.println("Array is palindrome");
        }else
            System.out.println("Array is not palindrome");

    }
}
