package Basics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void usingBitwise(int no){
        if((no & 1)==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }

    }
    public static void evenOrOdd(int no){
        if(no % 2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        evenOrOdd(no);
        usingBitwise(no);
    }
}
