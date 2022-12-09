import java.util.*;
import java.lang.Math;

public class Generator {
    
    private int urGuess;
    private int tempRange;
    
    public Generator(int yourGuess){
        urGuess = yourGuess;
    }
    
    public int getRange(String chosenDifficulty){
        if (chosenDifficulty.toLowerCase().equals("easy")){
            tempRange = (int)(10*Math.random() + 1);
        }
        else if (chosenDifficulty.toLowerCase().equals("medium")){
            tempRange = (int)(20*Math.random() + 1);
        }
        else if (chosenDifficulty.toLowerCase().equals("hard")){
            tempRange = (int)(50*Math.random() + 1);
        }
        else if (chosenDifficulty.toLowerCase().equals("extreme")){
            tempRange = (int)(100*Math.random() + 1);
        }
        else{
            tempRange = (int)(10*Math.random() + 1);
            System.out.println("Invalid Input, Default difficulty selected");
        }
        return tempRange;
    }
    
}
