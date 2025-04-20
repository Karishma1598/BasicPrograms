/*
8.String to Integer(atoi)
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
The algorithm for myAtoi(string s) is as follows:
1. Read in and ignore any leading whitespace.
2. Check if the next character (if not already at the end of the string) is '- or **'.
   Read this character in if it is either. This determines if the final result is negative or
   positive respectively. Assume the result is positive if neither is present.
3. Read in next the characters until the next non-digit character or the end of the input is
   reached. The rest of the string is ignored
4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were
   read, then the integer is e. Change the sign as necessary (from step 2).
5. If the integer is out of the 32-bit signed integer range [-2", 2 - 1], then clamp the
   integer so that it remains in the range. Specifically, integers less than -23 should be
   clamped to -23 , and integers greater than 2 - 1 should be clamped to 2 - 1.
6. Return the integer as the final result.

Example 1:
Input: s = "42"
Output: 42
Explanation:
The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
Example 2:
Input: s = " -042"
Output: -42
Explanation:
Step 1: "   -042" (leading whitespace is read and ignored)
Step 2: "   -042" ('-' is read, so the result should be negative)
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)

Example 3:
Input: s = "1337c0d3"
Output: 1337
Explanation:
Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)

Example 4:
Input: s = "0-1"
Output: 0
Explanation:
Step 1: "0-1" (no characters read because there is no leading whitespace)
Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
         
Example 5:
Input: s = "words and 987"
Output: 0
Explanation:
Reading stops at the first non-digit character 'w'.
 */
package String;

public class StringToInteger {
    public static int myAtoi(String str){
        str=str.trim();
        if(str.isEmpty()){
            return 0;
        }
        int i=0,sign=1;
        long res=0;
        char op=str.charAt(0);
        if(op=='-'){
            i++;
            sign=-1;
        } else if (op=='+') {
            i++;
        }

        while (i<str.length()){
            char ch=str.charAt(i);
            int digit=ch-48;
            if(digit<0 || digit >9){
                break;
            }
            res=res*10+digit;

            if(sign==-1){
                if(-res<=Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
            if(res>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            i++;
        }
        return (int)(res*sign);
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("-33"));
        System.out.println(myAtoi(""));
        System.out.println(myAtoi("+33"));
        System.out.println(myAtoi("Hello42"));
        System.out.println(myAtoi("1337c0d3"));

    }
}
