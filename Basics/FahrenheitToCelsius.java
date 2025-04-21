package Basics;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your temperature in Fahrenheit");
        float far=sc.nextFloat();
        float cel=(far-32) * 5.0f/9.0f;
        System.out.println("Temperature in celsius = "+cel);

    }
}
