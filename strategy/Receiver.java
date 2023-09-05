package strategy;
/*
 * The `Receiver` class represents a Player with who plays the ReceiverBehavior on offense. This player cannot play defense.
 *
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Receiver extends Player {
    /*
    * Constructor creates a new Receiver with a first name, last name, and offense/defense type.
    * @param firstName The String first name of the Receiver.
    * @param lastName  The String last name of the Receiver.
    * @param offense   A boolean indicating whether the Receiver is on the offense or defense.
    */
    public Receiver(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
    }
    /*
     * Sets the offense behavior of the Receiver to the Receive Behavior.
     */
    public void setOffenseBehavior(){
        OffenseBehavior output = new ReceiveBehavior();
        offenseBehavior = output;
    }
     /*
     * Sets the defense behavior of the Receiver to null, indicating this player cannot play defense.
     */
    public void setDefenseBehavior(){
        defenseBehavior = null;
    }
    
}
