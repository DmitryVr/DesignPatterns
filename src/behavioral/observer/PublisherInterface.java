package behavioral.observer;

import java.util.ArrayList;

/**
 * издатель
 */
public interface PublisherInterface {
    ArrayList<Observer> getObservers();

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void removeAllObservers();

    void notifyObservers(String message);
}
