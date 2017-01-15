package behavioral.observer;

import java.util.ArrayList;

/**
 * издатель
 */
public class Publisher implements PublisherInterface {
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public ArrayList<Observer> getObservers() {
        return observers;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void removeAllObservers() {
        observers.clear();
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.event(message);
        }
    }

    public void createNewMessage(String message) {
        System.out.println("Publisher printed message: " + message);
        this.notifyObservers(message);
    }
}
