/*
Given string str of the type "3(ab)4(cd)", the task is to expand it to
"abababcdcdcdcd" where integers are from the range [1, 9].

TEST CASE 1:
Input: str = "3(ab)4(cd)"
Output: abababcdcdcdcd

TEST CASE 2:
Input: str = "2(kl)3(ap)"
Output: klklapapap
 */
package String;

public class ExpandString {
    public static void expandGivenString(String  str){
        int i,j,k;
        StringBuffer output=new StringBuffer();
        for(i=0;i<str.length();i++){
            char c=str.charAt(i);
            int n=c-'0';
            StringBuffer temp=new StringBuffer();
            for(j=i+2;str.charAt(j)!=')';j++){
                temp.append(str.charAt(j));
            }
            for(k=1;k<=n;k++){
                output.append(temp);
            }
            i=j;
        }

        System.out.println(output);
    }

    public static void main(String[] args) {
        expandGivenString("3(ab)4(cd)");
        System.out.println("*************************");
        expandGivenString("2(kl)3(ap)");
    }
}
