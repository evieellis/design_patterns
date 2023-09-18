package decorator;
/*
 * The Paint class extends the VehicleDecorator to add color to a car,
 * A Painted car is constructed through appending color codes to the given file.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Paint extends VehicleDecorator{
    /*
     * 2D Array COLOR_ARRAY contains each color's name and code for easy iteration.
     */
    private final String[][] COLOR_ARRAY = {{"red" , "\u001B[31m"},{"green","\u001B[32m"},{"purple","\u001B[35m"},{ "blue" ,"\u001B[34m"},{"yellow" ,"\u001B[33m"},{"cyan", "\u001B[36m"}, {"none", "\u001B[0m"}};
    /*
     * Constructor makes Paint object which applies the specified color to the lines of a Vehicle.
     *
     * @param vehicle the Vehicle to which color will be added
     * @param color   the name of the color to apply, matched to the array
     */
    public Paint(Vehicle vehicle, String color){
        super(vehicle.lines); 
        if(!color.equals(COLOR_ARRAY[6][0])){
        addColor(vehicle, color);
        resetColor(vehicle);
        }
    } 
    /*
     * addColor appends the color code specified in the COLOR_ARRAY to the beginning
     * of the vehicle's file, meaning that the rest of the file will print in that
     * color.
     *
     * @param vehicle the Vehicle to which color will be added
     * @param color   the name of the color to apply, matched to the array
     */
   private void addColor(Vehicle vehicle, String color){
    StringBuilder newLine = new StringBuilder();
    for(int i = 0; i<COLOR_ARRAY.length-1; i++){
       if(color.equals(COLOR_ARRAY[i][0])){
         newLine.append(COLOR_ARRAY[i][1]);
         newLine.append(vehicle.lines.get(0));
        } 
    }
    super.lines.set(0, newLine.toString());
   }
   /*
     * resentColor appends the color code for no color to the end
     * of the vehicle's file, meaning that after the file, original
     * color will be restored
     *
     * @param vehicle the Vehicle to which 'no' color will be added
     */
   private void resetColor(Vehicle vehicle){
    final int LAST_LINE = vehicle.lines.size()-1;
    StringBuilder newLine = new StringBuilder();
    
         newLine.append(vehicle.lines.get(LAST_LINE));
         newLine.append(COLOR_ARRAY[6][1]);

    super.lines.set(LAST_LINE, newLine.toString());

   }
}
