package strategy;
/*
 * The StripBehavior class implements the DefenseBehavior interface to define
 * a specific play, which is stripping the ball.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class StripBehavior implements DefenseBehavior {
    /*
    *  Play method specifies 'Strip a ball from runners hands' as StripBehavior's play
    */
    public String play(){
        return "Strip a ball from runners hands";
    }
    
}
