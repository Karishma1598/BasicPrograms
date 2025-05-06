package Other;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void startGame(){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int numberToGuess=random.nextInt(101);
        int guess=0;
        int attempt=0;

        while (guess!=numberToGuess){
            System.out.println("Enter the number");
            guess=sc.nextInt();
            attempt++;
            if(guess>numberToGuess){
                System.out.println("Number is high");
            }else if(guess<numberToGuess){
                System.out.println("Number is low");
            }else {
                System.out.println("Yoh have guessed the number and you took "+attempt+" attempts");
            }
        }

    }
    public static void main(String[] args) {
        startGame();
    }
}
