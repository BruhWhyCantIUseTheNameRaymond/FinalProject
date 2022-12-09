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
        
        // Initialize Generator Object
        Generator gen = new Generator(guess);
        
        // Get random number
        int specialNum = gen.getNum();
        
        // Keep asking for input until user guesses correctly or quits
        while (guess != specialNum){
            System.out.println("Enter a guess between 1 and 10 (enter -1 to quit): ");
            guess = in.nextInt();
            
            if (guess == -1){
                break;
            }
            else if (guess < 1 || guess > 10){
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
