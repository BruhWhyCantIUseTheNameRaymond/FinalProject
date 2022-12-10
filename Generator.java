import java.util.*;
import java.lang.Math;

/**
 * The Generator class is used to help create a range for the random number
 * generator based on the difficulty requested by the user.
 */
public class Generator {
    
    // Initialize instance variables
    private int urGuess;
    private int tempRange;
    
    // Constructor to create object
    public Generator(int yourGuess){
        urGuess = yourGuess;
    }
    
    /**
     * The getRange method is used to create a range dependings
     * on the difficulty entered by the user.
     * 
     * @param String chosenDifficulty
     * @return int tempRange
     */
    public int getRange(String chosenDifficulty){
        if (chosenDifficulty.toLowerCase().equals("easy")){
            // Easy mode - Range: 1-10
            tempRange = (int)(10*Math.random() + 1);
        }
        else if (chosenDifficulty.toLowerCase().equals("medium")){
            // Medium mode - Range: 1-20
            tempRange = (int)(20*Math.random() + 1);
        }
        else if (chosenDifficulty.toLowerCase().equals("hard")){
            // Hard mode - Range: 1-50
            tempRange = (int)(50*Math.random() + 1);
        }
        else if (chosenDifficulty.toLowerCase().equals("extreme")){
            // Extreme mode - Range: 1-100
            tempRange = (int)(100*Math.random() + 1);
        }
        else{
            // Invalid Input - Default Range set: 1-10
            tempRange = (int)(10*Math.random() + 1);
            System.out.println("Invalid Input, Default difficulty selected");
        }
        return tempRange;
    }
    
}
