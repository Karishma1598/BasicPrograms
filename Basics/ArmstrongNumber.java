package Basics;

import java.util.Scanner;

public class ArmstrongNumber
{
    public static boolean isArmstrong(int num){
        int noOfDigits=noOfDigits(num);
        int numCopy=num;
        int finalNumber=0;
        while (num>0){
            int digit=num%10;
            num=num/10;
            finalNumber=finalNumber+pow(digit,noOfDigits);

        }
        return finalNumber==numCopy;
    }
    public static int pow(int digit,int noOfDigit){
        int result=1;
        int i=0;
        while (i<noOfDigit){
            result=result*digit;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int digits=0;
        while(num>0){
            digits++;
            num=num/10;
        }
        return digits;

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Number is armstrong");
        }else
            System.out.println("Number is not armstrong");
    }
}
