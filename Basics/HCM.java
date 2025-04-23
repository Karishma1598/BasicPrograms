package Basics;

import java.util.Scanner;

public class HCM {
    public static int least(int n1,int n2){
        if(n1<n2){
            return n1;
        }else
            return n2;
    }
    public static int findHCM(int n1,int n2){
        int gcd=1;
        int least=least(n1,n2);
        int i=2;
        while (i<=least){
            if(n1%i==0 && n2%i==0)
                gcd=i;
         i++;
        }
        return gcd;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no");
        int num1=sc.nextInt();

        System.out.println("Enter 2st no");
        int num2=sc.nextInt();
        System.out.println("Hcm = "+findHCM(num1,num2));
    }
}
