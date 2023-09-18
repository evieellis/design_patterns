package decorator;
import java.util.ArrayList;
/*
 * The Vehicle abstract class provides a base for cars, trucks, etc.
 * to be expanded on. It includes a constructor and a toString,
 * since each vehicle needs to be made and printed.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public abstract class Vehicle {
/*
 * Lines for the Vehicle can only be accessed by instantiations of
 * Vehicle class.
 */
    protected ArrayList<String> lines;
/*
 * Constructor sets the lines passed through to the lines of
 * the vehicle.
 * 
 * @param lines - array list of lines that will become the contents
 * of the vehicle
 */
    public Vehicle(ArrayList<String> lines){
        this.lines = lines;

    }
/*
 * toString prints each line of the vehicle by printing
 * each string in the vehicle's ArrayList followed by
 * a new line delimiter
 */
    public String toString(){
       String output = "";
       for(int i = 0; i<lines.size(); i++){
        output += lines.get(i) + "\n";
       }
       return output;
    }
    
}
