package observer;
/*
 * The Subject interface allows more specific subjects to be created, 
 * requiring the register, remove, and notify observer methods.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public interface Subject {  
    
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
    
}
