package Basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber(int num) {
        int revNumber=0;
        while (num>0){
            int rem=num%10;
            revNumber=revNumber*10+rem;
            num=num/10;
        }
        System.out.println("Reverse number is "+revNumber);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        reverseNumber(num);

    }
}
