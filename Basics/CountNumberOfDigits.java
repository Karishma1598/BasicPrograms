package Basics;

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("No of digits ="+countDigits(num));
    }
    public static int countDigits(int num){
        int digits=0;
        while (num>0) {
            num=num/10;
            digits++;
        }
        return digits;
    }
}
