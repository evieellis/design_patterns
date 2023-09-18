package decorator;
/*
 * The Smile class extends the VehicleDecorator to add rims to a car,
 * A Smiled car is constructed through integrating a smile file with the
 * original car file.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Smile extends VehicleDecorator{
    /*
     * Constructor makes Smile object which applies the smile to the lines of a Vehicle.
     *
     * @param vehicle the Vehicle to which smile will be added
     */
    public Smile(Vehicle vehicle){
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
        
    }
    
}
