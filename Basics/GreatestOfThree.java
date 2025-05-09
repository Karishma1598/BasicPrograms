package Basics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void greaterOfThree(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1=sc.nextInt();

        System.out.println("Enter the 1st number");
        int num2=sc.nextInt();

        System.out.println("Enter the 1st number");
        int num3=sc.nextInt();

        if(num1>=num2 && num1>=num3)
            System.out.println("number 1 i.e "+num1+" is greatest");
        else if (num2>=num3)
            System.out.println("number 2 i.e "+num2+" is greatest");
        else
            System.out.println("number 3 i.e "+num3+" is greatest");
    }
    public static void main(String[] args) {
        greaterOfThree();
    }
}
