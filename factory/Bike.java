package factory;
/*
 * The Bike abstract class provides a base for tricycles, striders,
 * kid's bikes, etc. to be expanded on. It includes public methods to
 * assemble the bike and access its price, as well as private helper
 * methods for its assembly.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public abstract class Bike {
/*
 * protected elements store:
 *  name - the type of bike it is as a String
 *  price - the dollar value of the bike
 *  numWheels - the number of wheels the bike has
 *  hasPeddals - whether or not the bike has pedals
 *  hasTrainingWheels - whether or not the bike has training wheels
 */
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;
/*
 * the assembleBike() method returns a String of bike assembly instructions,
 * initializing an output to create a type, then adding various parts to the
 * bike with private helper methods.
 */
    public String assembleBike(){
        String output = "Creating a " + name+ "\n";
            output += createFrame();
            output += addWheels();
            output += addPedals();
        return output;

    }
/*
 * the createFrame() method returns a String adding the frame of the bike
 * with its type name specified
 */
    private String createFrame(){
        return "- Assembling "+name+" frame\n";
    }
/*
 * the addWheels() method returns a String adding the specified numnber
 * of wheels, and a line about training wheels if applicable
 */
    private String addWheels(){
        String output = "- Adding " + numWheels + " wheel(s)\n";
        if(hasTrainingWheels){
            output += "- Adding training wheels\n";
        }
        return output;
    }
/*
 * the addPedals() method returns a String adding pedals if applicable
 */
    private String addPedals(){
        String output = "";
        if(hasPeddals){
            output += "- Adding pedals\n";
        }
        return output;


    }
/*
 * the getPrice() method returns the price
 */
    public double getPrice(){
        return price;

    }




}