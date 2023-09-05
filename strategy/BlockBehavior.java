package strategy;
import java.util.Random;
/*
 * The BlockBehavior class implements the DefenseBehavior interface to define
 * a specific play, which is blocking other types of plays.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class BlockBehavior implements DefenseBehavior {
    /*
    * This method randomly selects the play from block a kick, punt, pass, or catch.
    * The selection is made with equal probability.
    */
    public String play(){
        Random rand = new Random();
        int randNum = rand.nextInt(4) + 1;
        if(randNum == 1){
            return "block a kick";
        }
        if(randNum == 2){
            return "block a punt";
        }
        if(randNum == 3){
            return "block a pass";
        }
        return "block a catch";
    }
    
}
