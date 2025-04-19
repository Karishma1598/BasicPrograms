/*
Compress the string
Write a program to do basic string compression. Find character which is
consecutively repeated more than once, replace consecutive duplicate
occurrences with the count of repetitions.
Note:- Consecutive count of every character in the input string is less than
or equal to 9.

Test case-1:
Input: aaabbccdsa
Output: a3b2c2dsa

Test case-2:
Input: aaabbcddeeeee
Output: a3b2cd2e5
 */
package String;

public class CompressString {
    public static  void compress(String str){
        StringBuffer output=new StringBuffer();
        int i=0;
        while (i<str.length()){
            char ch=str.charAt(i);
            int count=0;
            while (i<str.length()){
                if(ch==str.charAt(i)){
                    count++;
                    i++;
                }else{
                    break;
                }
            }
            output.append(ch);
            if(count>1){
                output.append(count);
            }
        }
        System.out.println(output);
    }
    public static void main(String[] args) {
        compress("aaabbccdsa");
        compress("aaabbcddeeeee");

    }
}
