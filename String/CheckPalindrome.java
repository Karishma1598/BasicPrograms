/*
125. Valid Palindrome
A phrase is a palindrome if, after converting all uppercase letters into
lowercase letters and removing all non-alphanumeric characters, it reads
the same forward and backward. Alphanumeric characters include letters and
numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 */
package String;

public class CheckPalindrome {
    public static boolean isPalindrome(String s){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                if(ch>='A' && ch<='Z')
                    ch=(char)(ch+32);
                sb.append(ch);
            }
        }
        for(int start=0,end=sb.length()-1;start<end;){
            if(sb.charAt(start)!=sb.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("race a car"));

    }
}
