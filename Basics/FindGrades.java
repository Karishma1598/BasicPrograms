package Basics;

import java.util.Scanner;

public class FindGrades {
    public static void findGrades(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your percentage");
        float per=sc.nextFloat();

        if(per>=90){
            System.out.println("You have got grade A");
        }else if(per>=75){
            System.out.println("You have got grade B");
        }else if(per>=60){
            System.out.println("You have got grade C");
        } else if (per>=35) {
            System.out.println("You have got grade D");
        }else {
            System.out.println("You have failed the exam");
        }
    }
    public static void main(String[] args) {
        findGrades();
    }
}
