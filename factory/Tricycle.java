package factory;
/*
 * The Tricycle class extends the Bike class, providing
 * specifications for each variable outlined in the Bike class
 * according to a Tricycle
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Tricycle extends Bike{
 /*
 * The Tricycle method creates a Tricycle with all
 * necessary specifications by setting the object's variables accordingly.
 * 
 * Boolean variables not set will default to false.
 */
    public Tricycle(){
        this.name = "Tricycle";
        this.price = 80;
        this.numWheels = 3;
        this.hasPeddals = true;
    }

}