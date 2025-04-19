/*
Restrictive Candy Crush
Given a strings, the task is to reduce the string by applying the following
operation:
Choose a group of 2 consecutive identical characters and remove them.
The operation can be performed any number of times until it is no longer
possible.

TEST CASE 1:
s = "good"
Output: gd

TEST CASE 2:
s = "oppo"
Output:

TEST CASE 3:
s = "google"
Output:le
 */
package String;

public class CandyCrush {
    public static void reducedString(String str){
        StringBuffer sb=new StringBuffer(str);
        int i=0;
        while(i<sb.length()-1){
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(i+1);
            if(ch1==ch2){
                sb.delete(i,i+2);
                if(i!=0) {
                    i--;
                }
                continue;
            }
          i++;
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        reducedString("google");
        reducedString("good");
        reducedString("oppo");

    }
}
