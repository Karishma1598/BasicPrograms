/*
Check Pangram
Given a string check if it is Pangram or not. A pangram is a sentence
containing every letter in the English Alphabet.
Examples:
"The quick brown fox jumps over the lazy dog" is a Pangram
[contains all the character from A to Z]

"The quick brown fox jumps over the dog" is not a Pangram
[Doesn't contain all the characters from 'a' to 'Z', as 'l','a','z','y'
are missing]

TEST CASE 1:
Input: str = "Bawds jog, flick quartz, vex nymph"
Output: true

TEST CASE 2:
Input: str = "sdfs"
Output: false
 */
package String;

public class Pangram {
    public static boolean isPangram(String str){
        boolean[] result=new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int index;
            if(ch>='A' && ch<='Z'){
                index=ch-'A';
                result[index]=true;
            }else if (ch>='a' && ch<='z'){
                index=ch-'a';
                result[index]=true;
            }else {
                continue;
            }
        }
        for(boolean b:result){
            if(!b)      //b==false
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(isPangram("abchfijsdihdi"));
    }
}
