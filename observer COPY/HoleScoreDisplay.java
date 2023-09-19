package observer;
/*
 * The HoleScoreDisplay class implements the Observer interface to update scores
 * for one particular hole. It follows one golfer, and contains a toString method
 * to show the par and stroke stats when called.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class HoleScoreDisplay implements Observer{
    /*
     * @param golfer This subject is the golfer this particular observer is following
     * @param strokes This int is the amount of strokes currently recorded for the hole
     * @param par This int is the amount of pars currently recorded for the hole
     */
    private Subject golfer;
    private int strokes;
    private int par;
    /*
     * Constructor creates a new HoleScoreDisplay, registering itself to the list of
     * Observers for the golfer it follows, so it can receive notifications when the
     * Golfer's score updates. It passes through a golfer, which is assigned to the
     * class's golfer parameter.
     */
    public HoleScoreDisplay(Subject golfer){
        golfer.registerObserver(this);
        this.golfer = golfer;  
    }
    /*
     * Update passes in the strokes and par from the round, and sets it to the
     * strokes and par parameters. This updates them to the current hole.
     */
    public void update(int strokes, int par){
        this.strokes = strokes;
        this.par = par;

    }
    /*
     * toString finds the difference between the strokes and the par to determine
     * if the golfer is under par, making par, or over par in a particular hole. It
     * returns a String with the par, strokes, and the difference formatted as specified
     * in the output file given.
     */
    public String toString(){
        int dif = strokes-par;
        if (dif < 0) {
            return "\nCurrent Hole stats: Par ("+ this.par +") Strokes ("+this.strokes+"), "+ (dif*(-1)) + " under par";
        } else if (dif == 0) {
            return "\nCurrent Hole stats: Par ("+ this.par +") Strokes ("+this.strokes+"), "+ "Making par";
        } else {
            return "\nCurrent Hole stats: Par ("+ this.par +") Strokes ("+this.strokes+"), "+ dif + " over par";
        }

    }
    

    
}
