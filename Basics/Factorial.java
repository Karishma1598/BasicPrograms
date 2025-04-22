package Basics;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int num){
        if(num<0)
            return -1;
        if(num==0 || num==1)
            return 1;
        long fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static long factorialUsingRecurssion(int num){
        if(num<0)
            return -1;
        int fact=1;
        if(num==0 || num==1)
            return 1;
        return num*factorialUsingRecurssion(num-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(factorial(num));
        System.out.println(factorialUsingRecurssion(num));
    }
}
