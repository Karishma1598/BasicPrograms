/*
For a given two strings, 'str1' and 'str2', check whether they are a
permutation of each other or not.
Permutations of each other :- Two strings are said to be a permutation of
each other when either of the string's characters can be rearranged so that
it becomes identical to the other one.

Test case 1
========
Input str1="abcd" str2="dbca"
Output true

Test case 2
=====
Input str1="abcd" str2="cbae"
Output false

Test case 3
====
Input str1="abc" str2="abcd"
Output false
*/
package String;

public class Permutations {
    public static boolean isPermutation(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        int length=str1.length();
        int[] arr=new int[256];
        char x;
        for(int i=0;i<length;i++){
            x=str1.charAt(i);
            arr[x]++;
            x=str2.charAt(i);
            arr[x]--;
        }
        for(int i=0;i<length;i++){
            x=str1.charAt(i);
            if(arr[x]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPermutation("abcd","bcad"));
        System.out.println(isPermutation("abc","abcd"));
        System.out.println(isPermutation("abcd","abba"));

    }
}
