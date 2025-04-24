//Some leap years are=> 2024,2020,2000,1600,2016
package Basics;

import java.util.Scanner;

public class LeapYear {
    public static void isLeapYear(int year){
        if(year%400==0 ||(year%4==0 && year%100!=0)){
            System.out.println("This is leap year");
        }else {
            System.out.println("It is not a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        isLeapYear(year);
    }
}
