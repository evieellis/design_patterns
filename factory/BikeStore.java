package factory;
/*
 * The BikeStore abstract class makes Bicycles of a specified type
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class BikeStore {
/*
 * The createBike() method takes a String type, and depending on what is
 * passed through, returns a new Tricycle, Kids Bike, or Strider
 * 
 * @param type the type of bicycle to be made
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
    public Bike createBike(String type){
        if(type.toLowerCase().equals("tricycle")){
            return new Tricycle();
        }
        if(type.toLowerCase().equals("kids bike")){
            return new KidsBike();
        }
        return new Strider();

    }

}