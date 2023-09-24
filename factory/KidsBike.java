package factory;
/*
 * The KidsBike class extends the Bike class, providing
 * specifications for each variable outlined in the Bike class
 * according to a Kid's Bike
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class KidsBike extends Bike{
/*
 * The KidsBike method creates a Kid's Bike with all
 * necessary specifications by setting the object's variables accordingly.
 */
    public KidsBike(){
        this.name = "Kids Bike";
        this.price = 70;
        this.numWheels = 2;
        this.hasPeddals = true;
        this.hasTrainingWheels = true;

    }

}