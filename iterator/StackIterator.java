package iterator;
import java.util.Iterator;
import java.util.Stack;
/*
 * The StackIterator class provides methods to loop through stacks
 * starting with the first element in them, and traverse them,
 * returning an element in the next method.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class StackIterator implements Iterator{
/*
 * elements store:
 *  items - the String collection of elements to be iterated through
 *  position - the position the iterator is currently on
 */
    private Stack<String> items;
    private int position;
/*
 * Constructor sets the starting position to the 0th element, and
 * sets the items to the parameterized items.
 * 
 * @param items - Stack of string items to be iterated through
 */
    public StackIterator(Stack<String> items){
        this.items = items;
        this.position = 0;
    }
/*
 * next returns the next position of the stack as long as there is
 * a next element, and increment the position.
 */
    public String next(){
        if (!hasNext()) {
            return "No next element.";
        }
        return items.get(position++);    
    }
/*
 * hasNext returns if there is a next element from the current position
 * by comparing the position to the size of the items stack.
 */
    public boolean hasNext(){
        return position < items.size();
    }
    
    
}
