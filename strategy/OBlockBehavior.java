package strategy;
/*
 * The OBlockBehavior class implements the OffenseBehavior interface to define
 * a specific play, which is blocking defenders.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class OBlockBehavior implements OffenseBehavior {
/*
 *  Play method specifies 'Block Defenders' as OBlockBehavior's play
 */
    public String play(){
         return "Block Defenders";
     }
    
}
