package observer;
/*
 * The Observer interface allows more specific observers to be created, 
 * requiring the update and toString methods.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public interface Observer {

    public void update(int strokes, int par);
    public String toString();
    
}
