package Basics;

import java.util.Scanner;

public class Calculator {
    public  static void calculator(){
        Scanner sc=new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter the 1st number:");
            int num1 = sc.nextInt();
            System.out.println("Enter the 2nd number:");
            int num2 = sc.nextInt();
            System.out.println("Enter your choice");
            System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
            int choice = sc.nextInt();
            int result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Division by zero is not possible");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println("Do you want to continue (y/n) :");
            ch=sc.next().charAt(0);
        }while (ch=='y' || ch=='Y');
        System.out.println("Thank you! visit again...");

    }
    public static void main(String[] args) {
        calculator();
    }
}
