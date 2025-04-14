package Basics;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int no1= sc.nextInt();

        System.out.println("Enter 2nd number");
        int no2=sc.nextInt();
        System.out.println("Numbers before swapping are no1="+no1+
                " and no2="+no2);
        int c=no1;
        no1=no2;
        no2=c;
        System.out.println("Numbers after swapping are no1="+no1+
                " and no2="+no2);

        //we can swap without 3rd variable
        System.out.println();
        System.out.println();

        int a=10;
        int b=20;
        System.out.println("swap without using 3rd variable");
        System.out.println("before swapping a="+a+" and b="+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a="+a+" and b="+b);



    }



}
