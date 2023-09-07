package observer;

import java.util.ArrayList;

public class Golfer implements Subject {

    private ArrayList<Observer> observers;
    private String name;

    public Golfer(String name){
        observers = new ArrayList<Observer>();
        this.name = name;

    }

    public void registerObserver(Observer observer){

    }
    public void removeObserver(Observer observer){

    }
    public void notifyObservers(int strokes, int par){

    }
    public void enterScore(int strokes, int par){

    }
    public String getName(){
        return name;
    }

    
}
