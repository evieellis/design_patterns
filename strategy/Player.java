package strategy;
/*
 * The `Player` class represents a Player to be specified into either Lineman, QuarterBack, or Receiver. Therefore, this class is abstract.
 * Players have offense and defense behaviors, or different ways of executing plays.
 *
 * @author Evelyn Ellis
 * @version 1.0
 */
public abstract class Player {
    /*
     * @param firstName The String first name of the Player.
     * @param lastName  The String last name of the Player.
     * @param offense   A boolean indicating whether the Player is on the offense or defense.
     */
    private String firstName;
    private String lastName;
    private boolean offense;
    /*
     * @param offenseBehavior the type of offense the player will complete
     * @param defenseBehavior the type of defense the player will complete
     */
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;
    /*
     * Constructor creates a new Player with a first name, last name, and offense/defense type.
     */
    public Player(String firstName, String lastName, boolean offense){
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
        setOffenseBehavior();
        setDefenseBehavior();
    }
     /*
     * @param setDefenseBehavior the type of offense the player will complete, to be specified by specific player types
     * @param setOffenseBehavior the type of defense the player will complete, to be specified by specific player types
     */
    public abstract void setDefenseBehavior();
    public abstract void setOffenseBehavior();
    /*
     * play method checks if the player is on offense or defense, and if said behavior is null to return the behavior as a string.
     * If both behaviors are null, the method will return 'not playing'
     */
    public String play(){
        if (offense && offenseBehavior!=null) {
            setOffenseBehavior();
            return offenseBehavior.play();
        }
        if(defenseBehavior!=null){
            setDefenseBehavior();
            return defenseBehavior.play();
        }
        return "not playing";
        
    }
     /*
     * turnover method switches the player's offense status to its opposite
     */
    public void turnover(){
        offense = !offense;
    }
     /*
     * toString method returns the player's first and last name with a space in between
     */
    public String toString() {
        return firstName + " " + lastName;
    }
    
}
