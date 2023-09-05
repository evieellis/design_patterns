package strategy;
import java.util.Random;
/*
 * The `QuarterBack` class represents a Player with who can either run or pass with equal probability on offense. This player cannot play defense.
 *
 * @author Evelyn Ellis
 * @version 1.0
 */
public class QuarterBack extends Player {
    /*
     * Constructor creates a new QuarterBack with a first name, last name, and offense/defense type.
     * @param firstName The String first name of the QuarterBack.
     * @param lastName  The String last name of the QuarterBack.
     * @param offense   A boolean indicating whether the QuarterBack is on the offense or defense.
     */
    public QuarterBack(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }
    /*
     * Sets the offense behavior of the QuarterBack based on a random number between 1 & 2 from the random package.
     * It randomly selects between RunBehavior and PassBehavior and assigns it as the offense behavior.
     */
    public void setOffenseBehavior(){
        Random rand = new Random();
        int randNum = rand.nextInt(2) + 1;
        OffenseBehavior output;
        if(randNum == 1){
            output = new RunBehavior();
        } else {
            output = new PassBehavior();
        }
        offenseBehavior = output;
    }
    /*
     * Since the QuarterBack is not on defense, this method sets the defense behavior to null.
     */
    public void setDefenseBehavior(){
        defenseBehavior = null;
    }


}