package Basics;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void findState(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is zero");
        }
    }
    public static void main(String[] args) {
        findState();
    }
}
