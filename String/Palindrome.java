/*
Given a string, determine if it is a palindrome, considering only alphanumeric
characters.
What is Palindrome: - A palindrome is a word, number, phrase, or other
sequences of characters which read the same backwards and forwards.
Test case 1
Input: Malayalam
Output: true

Test case 2
Input: naveen
Output: false
*/
package String;

public class Palindrome {
    public static boolean isPalindrome(String str){
        int i,j;
        for(i=0,j= str.length()-1;i<j;i++,j--){
            char left=str.charAt(i);
            char right=str.charAt(j);
            if(left!=right){
                break;
            }
        }
        if(i<j){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="naman";
        String str1="karishma";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));

    }
}
