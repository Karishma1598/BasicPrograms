package Basics;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int revNum=0;
        int num1=num;
        while (num>0){
            revNum=revNum*10+(num%10);
            num=num/10;
        }
        if(revNum==num1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Number is palindrome");
        }else
            System.out.println("Number is not palindrome");

    }
}
