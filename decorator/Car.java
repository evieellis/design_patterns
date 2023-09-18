package decorator;
/*
 * The Car class extends the Vehicle class to define a car's construction.
 * A Car is constructed through reading a the lines from a car file.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Car extends Vehicle{
/*
 * Constructor calls the Vehicle constructor, passing in the lines from the car file.
 * These lines are accessed by reading them in our file reader.
 */
    public Car() {
        super(FileReader.getLines("decorator/txt/car.txt"));
    }

    
}
