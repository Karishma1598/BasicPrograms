package Basics;

import java.util.Scanner;

public class FibonaciiSeries {
    public static void fibonacii(int num){
        if(num<0)
            return;
        System.out.print("0 ");
        if(num==0)
            return;
        System.out.print("1 ");
        int firstNum=0;
        int secondNum=1;
        while (firstNum+secondNum<=num) {
            int third = firstNum + secondNum;
            System.out.print(third + " ");
            firstNum = secondNum;
            secondNum = third;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        fibonacii(num);
    }
}
