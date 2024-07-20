
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class numberGame {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int randInt = rand.nextInt(100);
        // int randInt = 88;
        System.out.println("A number has been generated!");
        System.out.println("You will get 8 chances to guess the number right!");
        System.out.println("Good luck! ");
        int chances = 8;
        // int a = 1;

        while(chances!=0){

            //taking guess and finding the difference
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            int difference = randInt - guess;
            
            
            //too high or too low, range is more than 50
            if(Math.abs(difference)>50){
                if(difference > 0){
                    System.out.println("too low");
                }
                else{
                System.out.println("too high");
            }}

            //high or low, range is more than 20 but less than 50
            else if(Math.abs(difference)>20){
                if(difference > 0){
                    System.out.println("low");
                }
                else{
                System.out.println("high");
            }}

            else if(Math.abs(difference)>10){
                if(difference > 0){
                    System.out.println("near low");
                }
                else{
                System.out.println("near up");
            }}

            else if(Math.abs(difference)>=5){
                if(difference > 0){
                    System.out.println("close but low");
                }
                else{
                System.out.println("close but high");
            }}

            else if(Math.abs(difference)>=2){
                System.out.println("Very close!");
            }

            else if (randInt == guess){
                System.out.println("you guessed it right!");
                break;
            }
            chances -=1;
            System.out.println("Chances left: " + chances);

        }
        if(chances == 0){
            System.out.println("The correct number was " + randInt);
            System.out.println("Better luck next time!");
        }

        sc.close();
    }
    
}
