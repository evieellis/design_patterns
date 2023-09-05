package strategy;
import java.util.Random;
/*
 * The PassBehavior class implements the OffenseBehavior interface to define
 * a specific play, which is throwing to other players.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class PassBehavior implements OffenseBehavior {
    /*
    * This method randomly selects the play from throw a slant route, out route, seem route, screen pass, or hail mary.
    * The selection is made with equal probability.
    */
    public String play(){
        Random rand = new Random();
        int randNum = rand.nextInt(5) + 1;
        if(randNum == 1){
            return "throws a slant route";
        }
        if(randNum == 2){
            return "throws a out route";
        }
        if(randNum == 3){
            return "throws a seem route";
        }
        if(randNum == 4){
            return "throws a screen pass";
        }
        return "throws a hail mary";
    }
    
}
