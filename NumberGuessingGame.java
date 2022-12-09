import java.util.*;
import java.util.Scanner;

/**
 * The NumberGuessingGame class creates a simple number guessing
 * game where the user guesses a number between 1 and 10
 * until they either guess the correct number or they quit.
 * 
 * @author Raymond Zhu
 */
public class NumberGuessingGame
{
    /**
     * The main method for the NumberGuessingGame class
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        // Initialize Scanner
        Scanner in = new Scanner(System.in);
        
        // Default guess value
        int guess = 0;
        
        // Default range value
        int range = 10;
        
        // Initialize Generator Object
        Generator gen = new Generator(guess);
        
        // Ask for wanted difficulty level
        System.out.println("Difficulty level (easy, medium, hard, extreme): ");
        String difficulty = in.next();
        
        // Inform user of difficulty chosen
        if (difficulty.toLowerCase().equals("easy")){
            System.out.println("Guess a number from 1 to 10");
            range = 10;
        }
        else if (difficulty.toLowerCase().equals("medium")){
            System.out.println("Guess a number from 1 to 20");
            range = 20;
        }
        else if (difficulty.toLowerCase().equals("hard")){
            System.out.println("Guess a number from 1 to 50");
            range = 50;
        }
        else if (difficulty.toLowerCase().equals("extreme")){
            System.out.println("Guess a number from 1 to 100");
            range = 100;
        }
        
        // Get random number
        int specialNum = gen.getRange(difficulty);
        
        // Keep asking for input until user guesses correctly or quits
        while (guess != specialNum){
            System.out.println("Enter a guess (enter -1 to quit): ");
            guess = in.nextInt();
            
            if (guess == -1){
                break;
            }
            else if (guess < 1 || guess > range){
                System.out.println("Guess out of bounds, please try again");
            }
        }

        // Display results
        if (guess == specialNum){
            System.out.println("You got it!");
        }
        else{
            System.out.println("Better Luck Next Time");
        }
    }
}
