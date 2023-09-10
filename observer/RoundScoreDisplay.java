package observer;
/*
 * The RoundScoreDisplay class implements the Observer interface to update scores
 * for the entire round. It follows one golfer, and contains a toString method
 * to show the par and stroke stats thus far when called.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class RoundScoreDisplay implements Observer{
    /*
     * @param golfer This subject is the golfer this particular observer is following
     * @param strokes This int is the amount of strokes currently recorded for the round
     * @param par This int is the amount of pars currently recorded for the round
     */
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;
    /*
     * Constructor creates a new RoundScoreDisplay, registering itself to the list of
     * Observers for the golfer it follows, so it can receive notifications when the
     * Golfer's score updates. It passes through a golfer, which is assigned to the
     * class's golfer parameter.
     */
    public RoundScoreDisplay(Subject golfer){
        golfer.registerObserver(this);
        this.golfer = golfer;
    }
    /*
     * Update passes in the strokes and par from the round, and adds it to the
     * strokes and par parameters. This creates a running total of each for the round.
     */
    public void update(int strokes, int par){
        strokesTotal += strokes;
        parTotal += par;
    }
    /*
     * toString finds the difference between the strokes and the par to determine
     * if the golfer is under par, making par, or over par in a particular round. It
     * returns a String with the par, strokes, and the difference formatted as specified
     * in the output file given.
     */
    public String toString(){
        int dif = strokesTotal-parTotal;
        if (dif < 0) {
            return "\nOverall stats: Par ("+ parTotal +") Strokes ("+strokesTotal+"), "+ (dif*(-1)) + " under par";
        } else if (dif == 0) {
            return "\nOverall stats: Par ("+ parTotal+") Strokes ("+strokesTotal+"), "+ "Making par";
        } else {
            return "\nOverall stats: Par ("+ parTotal +") Strokes ("+strokesTotal+"), "+ dif + " over par";
        }

    }
   
    
}
