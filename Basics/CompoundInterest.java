package Basics;

import java.util.Scanner;

public class CompoundInterest {
    public static double findInterest(int principle,double rate,
                                      double years){
        double interest=principle*Math.pow((1+(rate/100)),years);
        return interest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        int principle=sc.nextInt();
        System.out.println("Enter the time period");
        double years=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double rate=sc.nextDouble();
        double interest=findInterest(principle,years,rate);
        System.out.println("Simple Interest ="+interest);

    }
}
