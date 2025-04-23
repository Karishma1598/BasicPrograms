package Basics;

import java.util.Scanner;

public class LCM {
    public static int findLCM(int n1,int n2){
        int i=1;
        while (true){
            int factor=n1*i;
            if(factor%n2==0){
                return factor;
            }
            i++;
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no");
        int num1=sc.nextInt();

        System.out.println("Enter 2st no");
        int num2=sc.nextInt();
        System.out.println("Lcm = "+findLCM(num1,num2));
    }
}
