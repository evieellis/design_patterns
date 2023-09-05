package strategy;
import java.util.Random;
/*
 * The ReceiveBehavior class implements the OffenseBehavior interface to define
 * a specific play, which is running other types of plays.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class ReceiveBehavior implements OffenseBehavior {
    /*
    * This method randomly selects the play from run a slant route, out route, seem route, screen pass, or hail mary.
    * The selection is made with equal probability.
    */
    public String play(){
        Random rand = new Random();
        int randNum = rand.nextInt(5) + 1;
        if(randNum == 1){
            return "runs a slant route";
        }
        if(randNum == 2){
            return "runs a out route";
        }
        if(randNum == 3){
            return "runs a seem route";
        }
        if(randNum == 4){
            return "runs a screen pass";
        }
        return "runs a hail mary";
    }
    
}
