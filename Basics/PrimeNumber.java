package Basics;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num){
        if(num<=1)
            return false;

        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static boolean isPrime1(int num){
        if(num<=0)
            return false;
        int count=0;

        for(int i=1;i<=num;i++){
            if(num%i==0)
                count++;
        }
        if(count==2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isPrime1(num)){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }
    }
}
