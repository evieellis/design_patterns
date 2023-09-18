package decorator;
/*
 * The Rims class extends the VehicleDecorator to add rims to a car,
 * A Rimmed car is constructed through integrating a rim file with the
 * original car file.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Rims extends VehicleDecorator{
    /*
     * Constructor makes Rim object which applies the rims to the lines of a Vehicle.
     *
     * @param vehicle the Vehicle to which rims will be added
     */
    public Rims(Vehicle vehicle){
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));   
    }
    
}
