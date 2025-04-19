/*
Evaluate expression
Find Value of Variable After Performing Operations
There is a programming language with only four operations and one variable X:
++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.
Given an array of strings operations containing a list of operations, return
the final value of X after performing all the operations.
Input: operations = ["--X","X++","X++"]
Output: 1
Input: operations = ["++X", "++X","X++"]
Output: 3
 */
package String;

public class EvaluateExp {
    public static int solveOperation(String[] op){
        int X=0;
        for(String str:op){
            if(str=="++X" || str=="X++"){
                X=X+1;
            }else {
                X=X-1;
            }
        }
        return X;
    }
    public static void main(String[] args) {
        String[] op=new String[]{"--X","X++","X++"};
        String[] op1=new String[]{"++X", "++X","X++"};
        System.out.println(solveOperation(op));
        System.out.println(solveOperation(op1));


    }
}
