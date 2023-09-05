package strategy;
/*
 * The SackBehavior class implements the DefenseBehavior interface to define
 * a specific play, which is sacking the quarterback.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class SackBehavior implements DefenseBehavior {
/*
 *  Play method specifies 'Sack the quarterback' as SackBehavior's play
 */
    public String play(){
         return "Sack the quaterback";
     }
    
}
