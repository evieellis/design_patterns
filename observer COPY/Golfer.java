package observer;

import java.util.ArrayList;
/*
 * The Golfer class implements the Subject interface to define registering, removing,
 * and notifiying observers. It contains an array of the Observers that follow it,
 * and also has a name.
 * 
 * @author Evelyn Ellis
 * @version 1.0
 */
public class Golfer implements Subject {
    /*
     * @param observers This Array List contains each observer following the Golfer
     * @param name  The String name of the Golfer.
     */
    private ArrayList<Observer> observers;
    private String name;
    /*
     * Constructor creates a new Golfre with a name and a fresh Array List
     * of Observers.
     */
    public Golfer(String name){
        observers = new ArrayList<Observer>();
        this.name = name;
    }
     /*
     * registerObserver adds a specified observer to the Array List of observers.
     * This method is public, meaning other classes are able to add observers
     * to the golfer.
     */
    public void registerObserver(Observer observer){
        observers.add(observer);

    }
     /*
     * removesObserver removes a specified observer from the Array List of observers.
     * This method is public, meaning other classes are able to remove observers
     * from the golfer.
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);

    }
     /*
     * notifyObservers iterates through all the observers in the Golfer's Array List,
     * and updates the scores with the passed through strokes & pars.
     */
    public void notifyObservers(int strokes, int par){
        for (Observer observer : observers) {
            observer.update(strokes, par);
        }
    }
    /*
     * enterScore calls the notifyObservers method using the passed through
     * storkes & pars.
     */
    public void enterScore(int strokes, int par){
        notifyObservers(strokes, par);
    }
    /*
     * getName returns the String variable name.
     */
    public String getName(){
        return name;
    }

    
}
