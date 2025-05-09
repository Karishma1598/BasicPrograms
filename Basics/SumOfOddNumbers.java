package Basics;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();

        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0)
                sum=sum+i;
        }
        System.out.println("Sum ="+sum);
    }
    public static void main(String[] args) {
        sum();
    }
}
