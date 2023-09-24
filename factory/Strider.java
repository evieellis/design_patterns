package factory;
/*
 * The Strider class extends the Bike class, providing
 * specifications for each variable outlined in the Bike class
 * according to a Strider
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Strider extends Bike{
 /*
 * The Strider method creates a Strider with all
 * necessary specifications by setting the object's variables accordingly.
 * 
 * Boolean variables not set will default to false.
 */
    public Strider(){
        this.name = "Strider";
        this.price = 85;
        this.numWheels = 2;
        
    }

}