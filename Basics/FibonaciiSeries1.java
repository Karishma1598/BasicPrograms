package Basics;

import java.util.Scanner;

public class FibonaciiSeries1 {
    public static int fibonacii(int num){
        if(num==1)
            return 0;
        if(num==2)
            return  1;
        return fibonacii(num-1)+fibonacii(num-2);

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of ele you want to print");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(fibonacii(i)+" ");
        }

    }
}
