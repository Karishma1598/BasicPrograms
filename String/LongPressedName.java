/*
925. Long Pressed Name
Your friend is typing his name into a keyboard. Sometimes, when typing a
character c, the key might get long pressed, and the character will be
typed 1 or more times.
You examine the typed characters of the keyboard. Return True if it is
possible that it was your friends name, with some characters (possibly none)
being long pressed.
Example 1:
Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.

Example 2:
Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.
Constraints:
• 1 ‹= name. length, typed.length ‹= 1000
• name and typed consist of only lowercase English letters.
 */
package String;

public class LongPressedName {
    public static boolean isLongPressedName(String s1,String s2){
        if(s1.length()>s2.length())
            return false;
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(j);
            if(ch1==ch2){
                i++;
                j++;
            } else if (ch2==s1.charAt(i-1)) {
                j++;
            }else {
                return false;
            }
        }
        if(i==s1.length() && j==s2.length())
            return true;
        if(i<s1.length())
            return false;
        while (j<s2.length()){
            if(s2.charAt(j)!=s1.charAt(i))
                return false;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex","aaleex"));
        System.out.println(isLongPressedName("saeed","ssaaedd"));

    }
}
