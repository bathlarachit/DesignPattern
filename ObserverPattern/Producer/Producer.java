package ObserverPattern.Producer;

import ObserverPattern.Observer.Observer;

public interface Producer {

    void registerObserver(Observer observer);

    void removeObsever(Observer observer);

    void notifyObserver();

}
