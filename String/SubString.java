/*
For a given input string, write a function to print all the possible substrings.
Substring :- A substring is contiguous sequence of characters within a string.
Test case 1
Input: abc
Output: a ab abc b bc c

Test case 2
Input: co
Output: c co o
*/
package String;

public class SubString {

    public static  void printSubString(String str){
        int length=str.length();
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }
    public static  void printSubString01(String str){
        int length=str.length();
        for(int i=0;i<length;i++){
            StringBuffer sb=new StringBuffer();
            for(int j=i;j<length;j++){
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
        }
    }
    public static void main(String[] args) {
        printSubString("abcd");
        System.out.println("*******************************************");
        printSubString01("abc");
    }

}
