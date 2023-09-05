package strategy;
import java.util.Random;
/*
 * The `Lineman` class represents a Player with who performs the OBlockBehavior offense. This player can either block, strip, or sack with equal probability on defense.
 *
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Lineman extends Player {
    /*
     * Constructor creates a new Lineman with a first name, last name, and offense/defense type.
     * @param firstName The String first name of the Lineman.
     * @param lastName  The String last name of the Lineman.
     * @param offense   A boolean indicating whether the Lineman is on the offense or defense.
     */
    public Lineman(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }
     /*
     * Sets the offense behavior of the Lineman to the OBlockBehavior.
     */
    public void setOffenseBehavior(){
        OffenseBehavior output = new OBlockBehavior();
        offenseBehavior = output;
    }
    /*
     * Sets the defense behavior of the Lineman based on a random number between 1 & 3 from the random package.
     * It randomly selects between BlockBehavior, StripBehavior, and SackBehavior and assigns it as the defense behavior.
     */
    public void setDefenseBehavior(){
        Random rand = new Random();
        int randNum = rand.nextInt(3) + 1;
        if (randNum == 1){
            defenseBehavior = new BlockBehavior();
        } else if (randNum == 2){
            defenseBehavior = new StripBehavior();
        } else {
            defenseBehavior = new SackBehavior();
        }
    }
    
}
