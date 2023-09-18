package decorator;
import java.util.ArrayList;
/*
 * The VehicleDecorator abstract class provides a base for decorating vehicles
 * to be expanded on. It includes a constructor and an integration method,
 * used to combine a Vehicle's original files with decoration files. It extends
 * the Vehicle class to maintain the information about the Vehicle it belongs to.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public abstract class VehicleDecorator extends Vehicle {
/*
 * Constructor passes through its Vehicle's lines, and calls the
 * Vehicle constructor to add them.
 * 
 * @param lines - Array List which contains the string of each line
 */
    public VehicleDecorator(ArrayList<String> lines){
        super(lines);
    }
/**
 * inegrateDecor integrates decoration lines into the existing lines of the Vehicle by 
 * merging characters from both lines.The method combines the characters from the original
 * line and the decoration line, preserving characters from the decoration line while
 * keeping existing non-space characters from the original line.
 * 
 * Lines in decor with more characters than the original line will extend beyond the original 
 * line's length, and lines with fewer characters are cut off.
 *
 * @param decor An ArrayList of decoration lines to integrate into the existing lines.
 */
    protected void integrateDecor(ArrayList<String> decor){
        
        int maxLines = Math.min(super.lines.size(), decor.size());

        for (int lineIndex = 0; lineIndex < maxLines; lineIndex++) {
            String ogLine = super.lines.get(lineIndex);
            String decorLine = decor.get(lineIndex);

            StringBuilder newLine = new StringBuilder();

            int maxChars = Math.min(ogLine.length(), decorLine.length());

            for (int character = 0; character < maxChars; character++) {
                char ogChar = ogLine.charAt(character);
                char decorChar = decorLine.charAt(character);

                if (ogChar == ' ' || decorChar!= ' ') {
                    newLine.append(decorChar);
                } else {
                    newLine.append(ogChar);
                }
            }

            if (ogLine.length() > decorLine.length()) {
                newLine.append(ogLine.substring(decorLine.length()));
            } else if (decorLine.length() > ogLine.length()) {
                newLine.append(decorLine.substring(ogLine.length()));
            }

            super.lines.set(lineIndex, newLine.toString());
        
        }
    }
}
    

