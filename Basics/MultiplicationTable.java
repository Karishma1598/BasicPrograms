package Basics;

import java.util.Scanner;

public class MultiplicationTable {
    public static void table(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
    public static void main(String[] args) {
        table();
    }
}
