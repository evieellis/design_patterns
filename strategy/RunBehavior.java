package strategy;
import java.util.Random;
/*
 * The RunBehavior class implements the OffenseBehavior interface to define
 * a specific play, which is running other types of plays.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class RunBehavior implements OffenseBehavior {
    /*
    * This method randomly selects the play from runs a drive (up the gut), draw, pitch, or reverse,
    * The selection is made with equal probability.
    */
    public String play(){
        Random rand = new Random();
        int randNum = rand.nextInt(4) + 1;
        if(randNum == 1){
            return "runs a drive (up the gut)";
        }
        if(randNum == 2){
            return "runs a draw";
        }
        if(randNum == 3){
            return "runs a pitch";
        }
        return "runs a reverse";
    }
    
}
