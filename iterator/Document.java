package iterator;
import java.util.Stack;
/*
 * The Document class provides methods to make changes to a document including
 * making changes, undoing changes, and redoing changes. This creates a list of
 * commands which can be added to the redo and undo lists as changes.
 * 
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Document {
/*
 * elements store:
 *  title - the String name of the document
 *  undoStack - the stack of undo changes to be made
 *  redoStack - the stack of redo changes to be made
 */
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;
/*
 * Constructor takes in a string to become the Document's
 * title, and initializes the Document's undo and redo stacks.
 * 
 * @param title - string to become name of document
 */
    public Document(String title){
        this.title = title;
        undoStack = new Stack<String>();
        redoStack = new Stack<String>();

    }
/*
 * makeChange takes in a change, adds it to the Document's
 * undo stack, and returns a string to show which change
 * has been added to the undo stack.
 * 
 * @param change - string to be pushed onto undo stack
 */
    public String makeChange(String change){
        undoStack.push(change);
        return "Making Change: " + change;
    }
/*
 * undoChange pops off the most recent change made to
 * the undo stack, and pushes it onto the redo stack. It
 * returns a string showing which change was undone
 */
    public String undoChange(){
        String output = undoStack.pop();
        redoStack.push(output);
        return "Undoing: " + output;
    }
/*
 * canUndo checks if the undoStack is empty, meaning users cannot
 * undo anything else. Returns true if something is in undoStack, and
 * false otherwise.
 */
    public boolean canUndo(){
        if(undoStack.empty())
        return false;

        return true;
    }
/*
 * redoChange pops off the most recent change made to
 * the redo stack, and pushes it onto the undo stack. It
 * returns a string showing which change was undone
 */
    public String redoChange(){
        String output = redoStack.pop();
        undoStack.push(output);
        return "Redoing: "  + output;
    
    }
/*
 * canRedo checks if the redoStack is empty, meaning users cannot
 * undo anything else. Returns true if something is in redoStack, and
 * false otherwise.
 */
    public boolean canRedo(){
        if(redoStack.empty())
        return false;

        return true;
    }
/*
 * getUndoIterator returns the undo stack iterator
 */
    public StackIterator getUndoIterator(){
        StackIterator output = new StackIterator(undoStack);
        return output;
    }
/*
 * getRedoIterator returns the redo stack iterator
 */
    public StackIterator getRedoIterator(){
        StackIterator output = new StackIterator(redoStack);
        return output;
        
    }
    
    
}
