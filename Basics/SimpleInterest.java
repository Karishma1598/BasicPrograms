package Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static double findInterest(int principle,double rate,
                                      double years){
        double interest=(principle*rate*years)/100;

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
        double interst=findInterest(principle,years,rate);
        System.out.println("Simple Interest ="+interst);

    }
}
